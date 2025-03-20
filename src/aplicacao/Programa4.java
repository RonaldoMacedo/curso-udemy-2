package aplicacao;

import model.entities.DispositivoMultiuso;
import model.entities.ImpressoraConcreta;
import model.entities.ScannerConcreto;

public class Programa4 {

	public static void main(String[] args) {
		
		ImpressoraConcreta imp = new ImpressoraConcreta("1080");
		imp.processarDoc("Minha carta");
		imp.imprimir("Minha carta");
		
		System.out.println();
		ScannerConcreto sca = new ScannerConcreto("2003");
		sca.processarDoc("Meu email");
		System.out.println("Resultado do scan: " + sca.scanear());
		
		DispositivoMultiuso dm = new DispositivoMultiuso("2081");
		
		System.out.println();
		dm.processarDoc("Minha dissertação");
		dm.imprimir("Minha dissertação");
		System.out.println("Resultado do scan: " + dm.scanear());
	}

}
