package model.entities;

import model.enums.Cor;

public abstract class FiguraAbstrata implements Figura{
	
	private Cor cor;

	public FiguraAbstrata(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
