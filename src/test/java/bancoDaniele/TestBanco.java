package bancoDaniele;


import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestBanco {
	
	@Test
	public void TestNovo() {
		List<TituloDTO> titulosBanco = Arrays.asList(
				new TituloDTO("234", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO),
				new TituloDTO("245", LocalDate.of(2019, 5, 15), new BigDecimal("825"), StatusTitulo.PAGO),
				new TituloDTO("256", LocalDate.of(2019, 6, 20), new BigDecimal("380"), StatusTitulo.PAGO),
				new TituloDTO("257", LocalDate.of(2019, 6, 20), new BigDecimal("250"), StatusTitulo.PAGO));
		List<TituloDTO> titulosSerasa = Arrays.asList(
				new TituloDTO("234", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO),
				new TituloDTO("245", LocalDate.of(2019, 5, 15), new BigDecimal("825"), StatusTitulo.ATRASO),
				new TituloDTO("256", LocalDate.of(2019, 6, 20), new BigDecimal("380"), StatusTitulo.ATRASO));

		SerasaConciliacaoService service = new SerasaConciliacaoServiceImpl();
		List<ConciliacaoDTO> output = service.conciliar(titulosBanco, titulosSerasa);
		
		assertEquals("Deve retorna 2 titulos diferentes   conciliacao",2,output.size());
		
		ConciliacaoDTO conciliacao1 = output.get(0);

		Assert.assertEquals("O numero do documento é ", "245", conciliacao1.getNrDocumento());
		Assert.assertEquals("O valor do documento é ", new BigDecimal("825"), conciliacao1.getValor());
		Assert.assertEquals("O status do documento do banco ", StatusTitulo.PAGO, conciliacao1.getStatusBanco());
		Assert.assertEquals("O status do documento do serasa ", StatusTitulo.ATRASO, conciliacao1.getStatusSerasa());

		ConciliacaoDTO conciliacao2 = output.get(1);
		Assert.assertEquals("O numero do documento é ", "256", conciliacao2.getNrDocumento());
		Assert.assertEquals("O valor do documento é ", new BigDecimal("380"), conciliacao2.getValor());
		Assert.assertEquals("O status do documento do banco ", StatusTitulo.PAGO, conciliacao2.getStatusBanco());
		Assert.assertEquals("O status do documento do serasa ", StatusTitulo.ATRASO, conciliacao2.getStatusSerasa());
	}
}