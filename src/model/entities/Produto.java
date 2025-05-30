package model.entities;

public class Produto implements Comparable<Produto> {
	
	private String nome;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}

	@Override
	public int compareTo(Produto prod) {
		return preco.compareTo(prod.getPreco());
	}


}
