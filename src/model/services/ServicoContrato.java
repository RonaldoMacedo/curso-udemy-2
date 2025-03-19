package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoContrato {
	
	private ServicoPagamentoOnLine servicoPagamentoOnLine;

	public ServicoContrato(ServicoPagamentoOnLine servicoPagamentoOnLine) {
		super();
		this.servicoPagamentoOnLine = servicoPagamentoOnLine;
	}
	
	public void processarContrato(Contrato contrato, int meses) {
		contrato.getParcelas().add(new Parcela(LocalDate.of(2018, 7, 25), 206.04));
		contrato.getParcelas().add(new Parcela(LocalDate.of(2018, 8, 25), 208.08));
	}

}
