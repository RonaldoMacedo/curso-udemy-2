package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelDoCarro;
import model.entities.Veiculo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.print("Retirada (dia/mês/ano hora:minuto): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), dtm);
		System.out.print("Retorno (dia/mês/ano hora:minuto): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), dtm);
		
		AluguelDoCarro aluguel = new AluguelDoCarro(inicio, fim, new Veiculo(modeloCarro));
		
		sc.close();

	}

}
