package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelDoCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.ServicoImpostoBrasil;

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
		
		System.out.println("Entre com o preço por hora:");
		double precoPorHora = sc.nextDouble();
		System.out.println("Entre com o preço por dia:");
		double precoPorDia = sc.nextDouble();
																					  
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new ServicoImpostoBrasil());
																						// upcasting taxService - injeção de dependência por construtor
		servicoAluguel.processarFatura(aluguel);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + aluguel.getFatura().getPagamentoBasico());
		System.out.println("Imposto: " + aluguel.getFatura().getImposto());
		System.out.println("Pagamento total: " + aluguel.getFatura().getPagamentoTotal());
		
		sc.close();

	}

}
