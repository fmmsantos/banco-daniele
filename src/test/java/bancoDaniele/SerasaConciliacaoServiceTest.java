package bancoDaniele;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SerasaConciliacaoServiceTest {
	
	@Test
	public void conciliar4TitulosDoBancoCom3DaSerasaCom2Diferencasa() {
		List<TituloDTO> titulosBanco = Arrays.asList(
			new TituloDTO("234", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO),
			new TituloDTO("245", LocalDate.of(2019, 5, 15), new BigDecimal("825"), StatusTitulo.PAGO),
			new TituloDTO("256", LocalDate.of(2019, 6, 20), new BigDecimal("380"), StatusTitulo.PAGO),
			new TituloDTO("257", LocalDate.of(2019, 6, 20), new BigDecimal("250"), StatusTitulo.PAGO)
		);
		
		List<TituloDTO> titulosSerasa = Arrays.asList(
			new TituloDTO("234", LocalDate.of(2019, 4, 10), new BigDecimal("700"), StatusTitulo.ATRASO), 
			new TituloDTO("245", LocalDate.of(2019, 5, 15), new BigDecimal("825"), StatusTitulo.ATRASO), 
			new TituloDTO("256", LocalDate.of(2019, 6, 20), new BigDecimal("380"),StatusTitulo.ATRASO)  
		);
		
		SerasaConciliacaoService service = new SerasaConciliacaoServiceImpl();
		List<ConciliacaoDTO> output = service.conciliar(titulosBanco, titulosSerasa);
		
		// Verifica a quantidade de conciliacoes
		assertEquals("Deve retorna 2 titulos diferentes da conciliacao",2,output.size());
		
		// Valida os itens da conciliacao
		
		// Primeiro item da conciliacao: ConciliacaoDTO(nrDocumento="245", valor=825, statusBanco=PAGO, statusSerasa=ATRASO)
		ConciliacaoDTO conciliacao1 = output.get(0);
		assertEquals("245", conciliacao1.getNrDocumento());
		assertEquals(new BigDecimal("825"), conciliacao1.getValor());
		assertEquals(StatusTitulo.PAGO, conciliacao1.getStatusBanco());
		assertEquals(StatusTitulo.ATRASO, conciliacao1.getStatusSerasa());
		
		// Segundo item da conciliacao: ConciliacaoDTO(nrDocumento="256", valor=380, statusBanco=PAGO, statusSerasa=ATRASO)
		ConciliacaoDTO conciliacao2 = output.get(1);
		assertEquals("256", conciliacao2.getNrDocumento());
		assertEquals(new BigDecimal("380"), conciliacao2.getValor());
		assertEquals(StatusTitulo.PAGO, conciliacao2.getStatusBanco());
		assertEquals(StatusTitulo.ATRASO, conciliacao2.getStatusSerasa());
		
	}
	
}
