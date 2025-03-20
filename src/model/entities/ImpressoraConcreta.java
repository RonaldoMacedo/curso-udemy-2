package model.entities;

public class ImpressoraConcreta extends Dispositivo implements Impressora{

	public ImpressoraConcreta(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando impressão: " + doc);	
	}
	
	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
