package questao4;

public class Imovel {
	
	private double metrosQuadrado;
	private Endereco endereco;
	private double valor;
	
	public Imovel(double metrosQuadrado, Endereco endereco, double valor) {
		this.metrosQuadrado = metrosQuadrado;
		this.endereco = endereco;
		this.valor = valor;
	}

	public double getMetrosQuadrado() {
		return metrosQuadrado;
	}

	public void setMetrosQuadrado(double metrosQuadrado) {
		this.metrosQuadrado = metrosQuadrado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
