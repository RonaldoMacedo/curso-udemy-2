package model.entities;

public class DispositivoMultiuso extends Dispositivo implements Scanner, Impressora {

	public DispositivoMultiuso(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo multifuncional: " + doc);		
	}

	@Override
	public String scanear() {
		return "Resultando multifuncional scanner";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando multifuncional: " + doc);		
	}

}
