package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ServicoContrato;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dia/mês/ano): ");
		LocalDate data = LocalDate.parse(sc.next(), dtm);
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Digite quantas parcelas: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(null);
		servicoContrato.processarContrato(contrato, n);
		
		System.out.println("PARCELAS:");
		for(Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();

	}

}
