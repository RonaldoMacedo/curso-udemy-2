package model.entities;

public class Impressora extends Dispositivo {

	public Impressora(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando impressão: " + doc);	
	}
	
	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
