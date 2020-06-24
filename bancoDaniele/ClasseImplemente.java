package bancoDaniele;

import java.util.ArrayList;
import java.util.List;

public class ClasseImplemente implements SerasaConciliacaoService {

	@Override
	public List<ConciliacaoDTO> conciliar(List<TituloDTO> titulosBanco, List<TituloDTO> tituloSerasa) {
		
		List<ConciliacaoDTO> conciliacoes = new ArrayList<>();

		for (TituloDTO banco : titulosBanco) {
			
			for (TituloDTO serasa : tituloSerasa) {
				if(banco.getNrDocumento().equals(serasa.getNrDocumento()) && banco.getStatus()!=serasa.getStatus()) {
				ConciliacaoDTO conc = new ConciliacaoDTO();
				conc.setNrDocumento(banco.getNrDocumento());
				conc.setDataVencimento(banco.getDataVencimento());
				conc.setStatusBanco(banco.getStatus());
				conc.setStatusSerasa(serasa.getStatus());
				conc.setValor(banco.getValor());
				
					conciliacoes.add(conc);
				}
				else {
					throw new IllegalArgumentException("nao sao iguais");
				}
				break;
			}
			

		}
		return conciliacoes;
	}

}
