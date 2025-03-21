package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa5 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		String caminho = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String nome = br.readLine();
			while(nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			Collections.sort(lista); // <-- uma forma de ordenar uma coleção
			for(String s : lista) {
				System.out.println(s);
			}
				
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
