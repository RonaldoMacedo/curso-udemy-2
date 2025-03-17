package model.services;

import java.time.Duration;

import model.entities.AluguelDoCarro;
import model.entities.Fatura;

public class ServicoAluguel {

	private Double precoPorHora;
	private Double precoPorDia;

	private ServicoImposto servicoImposto;

	public ServicoAluguel(Double precoPorHora, Double precoPorDia, ServicoImposto servicoImposto) {
		super();
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.servicoImposto = servicoImposto;
	}

	public void processarFatura(AluguelDoCarro aluguel) {

		double minutos = Duration.between(aluguel.getInicio(), aluguel.getFim()).toMinutes();
		double horas = minutos / 60.0;

		double pagamentoBasico;

		if (horas <= 12.0)
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		else
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);

		double imposto = servicoImposto.imposto(pagamentoBasico);

		aluguel.setFatura(new Fatura(pagamentoBasico, imposto));
	}

}
