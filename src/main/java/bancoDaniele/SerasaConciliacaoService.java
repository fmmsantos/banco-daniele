package bancoDaniele;

import java.util.List;

public interface SerasaConciliacaoService {
	List<ConciliacaoDTO> conciliar( List<TituloDTO> titulosBanco,List<TituloDTO> tituloSerasa);

}
