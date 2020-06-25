package bancoDaniele;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import bancoDaniele.SerasaConciliacaoServiceImpl;
import bancoDaniele.StatusTitulo;
import bancoDaniele.TituloDTO;

public class TestBanco {
	@Test
	public void resultadoBanco() {
		TituloDTO banco = new TituloDTO("1233", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO);
		TituloDTO banco1 = new TituloDTO("1234", LocalDate.of(2019, 5, 15), new BigDecimal("800"), StatusTitulo.PAGO);
		TituloDTO banco2 = new TituloDTO("1235", LocalDate.of(2019, 6, 20), new BigDecimal("600"), StatusTitulo.PAGO);

		TituloDTO serasa = new TituloDTO("1233", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO);
		TituloDTO serasa1 = new TituloDTO("1234", LocalDate.of(2019, 5, 15), new BigDecimal("800"), StatusTitulo.PAGO);
		TituloDTO serasa2 = new TituloDTO("1235", LocalDate.of(2019, 6, 20), new BigDecimal("600"),StatusTitulo.ATRASO);

		List<TituloDTO> serasas = new ArrayList<>();
		Arrays.asList(serasa, serasa1, serasa2);

		List<TituloDTO> bancos = new ArrayList<>();
		Arrays.asList(banco, banco1, banco2);
		
		SerasaConciliacaoService service = new SerasaConciliacaoServiceImpl();
		List<ConciliacaoDTO> output = service.conciliar(bancos, serasas);
		
		Assert.assertEquals("Deve retorna um titulo diferente da conciliacao",1,output.size());
		Assert.assertEquals("O numero do documento é ","1235",output.get(2).getNrDocumento());
		Assert.assertEquals("O valor do documento é ",new BigDecimal("600"),output.get(2).getValor());
		Assert.assertEquals("O status do documento do banco ",StatusTitulo.PAGO,output.get(2).getStatusBanco());
		Assert.assertEquals("O status do documento do serasa ",StatusTitulo.ATRASO,output.get(2).getStatusSerasa());
	}

}