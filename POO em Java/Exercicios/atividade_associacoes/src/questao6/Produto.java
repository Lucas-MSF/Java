package questao6;

public class Produto {
	private String nome;
	private String marca;
	private String tipo;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, String marca, String tipo, double preco, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.preco = preco;
		this.quantidade= quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
