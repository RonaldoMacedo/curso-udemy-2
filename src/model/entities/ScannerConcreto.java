package model.entities;

public class ScannerConcreto extends Dispositivo implements Scanner{

	public ScannerConcreto(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando scanner: " + doc);
	}
	
	@Override
	public String scanear() {
		return "Conteúdo scaneado";
	}

}
