package bancoDaniele;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		TituloDTO serasa=new TituloDTO("123", LocalDate.of(2019, 3, 10),new BigDecimal("253.74"),StatusTitulo.ATRASO);
		TituloDTO serasa1=new TituloDTO("252", LocalDate.of(2020, 1, 15),new BigDecimal("100.00"),StatusTitulo.ATRASO);
		TituloDTO serasa2=new TituloDTO("356", LocalDate.of(2019, 5, 15),new BigDecimal("380.28"),StatusTitulo.ATRASO);

		TituloDTO banco=new TituloDTO("123", LocalDate.of(2019, 3, 10),new BigDecimal("253.74"),StatusTitulo.PAGO);
		TituloDTO banco1=new TituloDTO("252", LocalDate.of(2020, 1, 15),new BigDecimal("100.00"),StatusTitulo.ATRASO);
		TituloDTO banco2=new TituloDTO("356", LocalDate.of(2019, 5, 15),new BigDecimal("380.28"),StatusTitulo.RECOMPRADO);
		TituloDTO banco3=new TituloDTO("453", LocalDate.of(2019, 5, 15),new BigDecimal("380.28"),StatusTitulo.A_VENCER);
		
		List<TituloDTO> serasas= new ArrayList<>();
		serasas.add(serasa);
		serasas.add(serasa1);
		serasas.add(serasa2);
		
		List<TituloDTO> bancos= new ArrayList<>();
		bancos.add(banco);
		bancos.add(banco1);
		bancos.add(banco2);
		bancos.add(banco3);
		SerasaConciliacaoServiceImpl clas = new SerasaConciliacaoServiceImpl();
		
				
			System.out.println(clas.conciliar(bancos, serasas));
		
		
		
		
		
		
		
		
	}

}
