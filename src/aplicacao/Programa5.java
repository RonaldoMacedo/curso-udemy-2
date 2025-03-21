package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class Programa5 {

	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		String caminho = "C:\\temp\\in.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String funcionarioCSV = br.readLine();
			while(funcionarioCSV != null) {
				String[] campos = funcionarioCSV.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCSV = br.readLine();
			}
			Collections.sort(lista); // <-- uma forma de ordenar uma coleção
			for(Funcionario func : lista) {
				System.out.println(func.getNome() + ", " + func.getSalario());
			}
				
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
