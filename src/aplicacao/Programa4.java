package aplicacao;

import model.entities.Impressora;
import model.entities.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
		Impressora imp = new Impressora("1080");
		imp.processarDoc("Minha carta");
		imp.imprimir("Minha carta");
		
		Scanner sca = new Scanner("2003");
		sca.processarDoc("Meu email");
		System.out.println("Resultado do scan: " + sca.scanear());

	}

}
