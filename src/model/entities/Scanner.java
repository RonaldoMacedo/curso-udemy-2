package model.entities;

public class Scanner extends Dispositivo {

	public Scanner(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando scanner: " + doc);
	}
	
	public String scanear() {
		return "Conteúdo scaneado";
	}

}
