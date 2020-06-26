package bancoDaniele;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConciliacaoDTO {
	private String nrDocumento;
	private LocalDate dataVencimento;
	private BigDecimal valor;
	private StatusTitulo statusBanco;
	private StatusTitulo statusSerasa;
	
	
	
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
	public StatusTitulo getStatusBanco() {
		return statusBanco;
	}
	public void setStatusBanco(StatusTitulo statusBanco) {
		this.statusBanco = statusBanco;
	}
	public StatusTitulo getStatusSerasa() {
		return statusSerasa;
	}
	public void setStatusSerasa(StatusTitulo statusSerasa) {
		this.statusSerasa = statusSerasa;
	}
	
}
