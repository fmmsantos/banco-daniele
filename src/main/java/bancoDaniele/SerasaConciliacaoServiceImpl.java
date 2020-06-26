package bancoDaniele;

import java.util.ArrayList;
import java.util.List;

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
			
			LOGGER.debug("Verifica titulo banco | index: {} | {}", indexTituloBanco, tituloBanco);
			
			indexTituloSerasa = 0;
			for (TituloDTO tituloSerasa : titulosSerasa) {
				
				LOGGER.debug("Verifica titulo serasa | index: {} | {}", indexTituloSerasa, tituloSerasa);
				
				if (tituloBanco.getNrDocumento().equals(tituloSerasa.getNrDocumento()) && tituloBanco.getStatus() != tituloSerasa.getStatus()) {
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
		
		return conciliacoes;
	}

}
