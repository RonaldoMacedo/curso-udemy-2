package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	
	private static DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate data;
	private Double valor;
	
	public Parcela() {
		
	}

	public Parcela(LocalDate data, Double valor) {
		super();
		this.data = data;
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return data.format(dtm) + " - " + String.format("%.2f", valor);
	}

}
