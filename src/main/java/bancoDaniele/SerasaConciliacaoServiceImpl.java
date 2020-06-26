package bancoDaniele;

import java.util.ArrayList;
import java.util.List;

public class SerasaConciliacaoServiceImpl implements SerasaConciliacaoService {

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
					System.out.println("quant "+ conciliacoes.size());
					System.out.println("numero documento "+conc.getNrDocumento());
					System.out.println("data venc "+conc.getDataVencimento());
					System.out.println("status banco "+conc.getStatusBanco());
					System.out.println("status serasa "+conc.getStatusSerasa());
					System.out.println("valor "+ conc.getValor());
				}
				
				
				
			}
			

		}
		return conciliacoes;
	}

}
