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
		
		double parcelaBasica = contrato.getValorTotal() / meses;
		
		for(int i = 1; i <= meses; i++) {
			LocalDate vencimento = contrato.getData().plusMonths(i);
			
			double juro = servicoPagamentoOnLine.juro(parcelaBasica, i);
			double taxa = servicoPagamentoOnLine.taxaPagamento(parcelaBasica + juro);
			double quota = parcelaBasica + juro + taxa;
			
			contrato.getParcelas().add(new Parcela(vencimento, quota));
		}
	}

}
