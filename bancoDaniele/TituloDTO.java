package bancoDaniele;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class TituloDTO {
	private String nrDocumento;
	private LocalDate dataVencimento;
	private BigDecimal valor;
	private StatusTitulo status;
	
	
	
	public TituloDTO(String nrDocumento, LocalDate dataVencimento, BigDecimal valor, StatusTitulo status
	) {
		super();
		this.nrDocumento = nrDocumento;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.status=status;
		
	}
	
	public TituloDTO() {
		super();
	}

	public String getNrDocumento() {
		return nrDocumento;
	}
	public void setNrDocumento(String nrDocumento) {
		this.nrDocumento = nrDocumento;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public StatusTitulo getStatus() {
		return status;
	}

	public void setStatus(StatusTitulo status) {
		this.status = status;
	}
	
	
	
	
	
	

}
