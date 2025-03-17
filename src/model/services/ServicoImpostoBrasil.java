package model.services;

public class ServicoImpostoBrasil {
	
	public Double imposto(Double quantia) {
		if(quantia <= 100.0)
			return quantia * 0.2;
		else
			return quantia * 0.15;
	}

}
