package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circulo;
import model.entities.FiguraAbstrata;
import model.entities.Retangulo;
import model.enums.Cor;

public class Programa3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FiguraAbstrata fig1 = new Circulo(Cor.BLACK, 2.0);
		FiguraAbstrata fig2 = new Retangulo(Cor.WHITE, 3.0, 4.0);
		
		System.out.println("Cor do círculo: " + fig1.getCor());
		System.out.println("Área do círculo: " + String.format("%.3f", fig1.area()));
		System.out.println("Cor do retângulo: " + fig2.getCor());
		System.out.println("Área do retângulo: " + String.format("%.3f", fig2.area()));
		
		sc.close();

	}

}
