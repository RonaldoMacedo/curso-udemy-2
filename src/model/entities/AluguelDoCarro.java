package model.entities;

import java.time.LocalDateTime;

public class AluguelDoCarro {
	
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDoCarro() {
		
	}

	public AluguelDoCarro(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
