package bancoDaniele;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
	
	TituloDTO banco = new TituloDTO("1233", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO);
	TituloDTO banco1 = new TituloDTO("1234", LocalDate.of(2019, 5, 15), new BigDecimal("800"), StatusTitulo.PAGO);
	TituloDTO banco2 = new TituloDTO("1235", LocalDate.of(2019, 6, 20), new BigDecimal("600"), StatusTitulo.PAGO);

	TituloDTO serasa = new TituloDTO("1233", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO);
	TituloDTO serasa1 = new TituloDTO("1234", LocalDate.of(2019, 5, 15), new BigDecimal("800"), StatusTitulo.PAGO);
	TituloDTO serasa2 = new TituloDTO("1235", LocalDate.of(2019, 6, 20), new BigDecimal("600"),StatusTitulo.ATRASO);
		
		List<TituloDTO> serasas= new ArrayList<>();
		serasas.add(serasa);
		serasas.add(serasa1);
		serasas.add(serasa2);
		
		List<TituloDTO> bancos= new ArrayList<>();
		bancos.add(banco);
		bancos.add(banco1);
		bancos.add(banco2);
		//bancos.add(banco3);
		SerasaConciliacaoService service = new SerasaConciliacaoServiceImpl();
		List<ConciliacaoDTO> output = service.conciliar(bancos, serasas);
		
		
		
		
		
	
		
		
		
		
	}

}
