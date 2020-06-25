package bancoDaniele;


import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import bancoDaniele.SerasaConciliacaoServiceImpl;
import bancoDaniele.StatusTitulo;
import bancoDaniele.TituloDTO;

public class TestBanco {
	@Test
	public void resultadoBanco() {
	TituloDTO banco=new TituloDTO("1233", LocalDate.of(2019, 4, 10),new BigDecimal("700"),StatusTitulo.ATRASO);
	TituloDTO banco1=new TituloDTO("1234", LocalDate.of(2019, 5, 15),new BigDecimal("800"),StatusTitulo.PAGO);
	TituloDTO banco2=new TituloDTO("1235", LocalDate.of(2019, 6, 20),new BigDecimal("600"),StatusTitulo.PAGO);

	TituloDTO serasa=new TituloDTO("1233", LocalDate.of(2019, 4, 10),new BigDecimal("700"),StatusTitulo.ATRASO);
	TituloDTO serasa1=new TituloDTO("1234", LocalDate.of(2019, 5, 15),new BigDecimal("800"),StatusTitulo.PAGO);
	TituloDTO serasa2=new TituloDTO("1235", LocalDate.of(2019, 6, 20),new BigDecimal("600"),StatusTitulo.ATRASO);
	
	List<TituloDTO> serasas= new ArrayList<>();
	serasas.add(serasa);
	serasas.add(serasa1);
	serasas.add(serasa2);
	
	List<TituloDTO> bancos= new ArrayList<>();
	bancos.add(banco);
	bancos.add(banco1);
	bancos.add(banco2);
	SerasaConciliacaoServiceImpl clas = new SerasaConciliacaoServiceImpl();
	clas.conciliar(bancos, serasas);
	Assert.assertEquals(StatusTitulo.PAGO, StatusTitulo.PAGO);
	
	
	}
	@Test
	public void resultadoBanco3ValoresDiferente() {
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
	 
	clas.conciliar(bancos, serasas);
	
	}

}
