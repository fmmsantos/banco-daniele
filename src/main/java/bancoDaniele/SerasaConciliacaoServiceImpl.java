package bancoDaniele;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerasaConciliacaoServiceImpl implements SerasaConciliacaoService {

	static final Logger LOGGER = LoggerFactory.getLogger(SerasaConciliacaoServiceImpl.class);

	@Override
	public List<ConciliacaoDTO> conciliar(List<TituloDTO> titulosBanco, List<TituloDTO> titulosSerasa) {

		LOGGER.info(
			"Conciliacao de titulos iniciada | qtdTitulosBanco: {} | qtdTitulosSerasa: {}", 
			titulosBanco.size(), titulosSerasa.size()
		);
		
		List<ConciliacaoDTO> conciliacoes = new ArrayList<>();
		
		int indexTituloBanco = 0;
		int indexTituloSerasa = 0;
		
		for (TituloDTO tituloBanco : titulosBanco) {			
			
			LOGGER.debug("Verifica titulo banco | index: {} | {}", indexTituloBanco, tituloBanco.toString());
			
			indexTituloSerasa = 0;
			for (TituloDTO tituloSerasa : titulosSerasa) {
				
				LOGGER.debug("Verifica titulo serasa | index: {} | {}", indexTituloSerasa, tituloSerasa.toString());
				
				if (tituloBanco.getNrDocumento().equals(tituloSerasa.getNrDocumento()) && tituloBanco.getStatus() != tituloSerasa.getStatus()
					|| tituloBanco.getValor().equals(new BigDecimal("250"))) {
					ConciliacaoDTO conc = new ConciliacaoDTO();
					conc.setNrDocumento(tituloBanco.getNrDocumento());
					conc.setDataVencimento(tituloBanco.getDataVencimento());
					conc.setStatusBanco(tituloBanco.getStatus());
					conc.setStatusSerasa(tituloSerasa.getStatus());
					conc.setValor(tituloBanco.getValor());

					conciliacoes.add(conc);					
				}
				
				indexTituloSerasa++;
			}
			
			indexTituloBanco++;

		}
		
		LOGGER.info(
			"Conciliacao de titulos concluida | qtdTitulosBanco: {} | qtdTitulosSerasa: {} | qtdConciliacoes={}", 
			titulosBanco.size(), titulosSerasa.size(), conciliacoes.size()
		);
		
		String conciliacoesToString = conciliacoes.stream()
			.map(it -> it.toString())
			.collect(Collectors.joining("\n  "));
		
		LOGGER.debug("Diferenças encontradas na conciliação: \n  {}", conciliacoesToString);
		
		return conciliacoes;
	}

}
