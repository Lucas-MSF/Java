package entidades;

public class ConsumoComida {
	private Comida comida;
	private int quantidade;
	
	public ConsumoComida(){}

	public ConsumoComida(Comida comida, int quantidade) {
		this.comida = comida;
		this.quantidade = quantidade;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void addQuantidade(int quantidade) {
		this.quantidade+=quantidade;
	}
	public void removeQuantidade(int quantidade) {
		this.quantidade-=quantidade;
	}
}
