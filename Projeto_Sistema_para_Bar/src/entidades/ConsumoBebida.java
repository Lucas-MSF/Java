package entidades;

public class ConsumoBebida {

	private Bebidas bebida;
	private int quantidade;
	
	public ConsumoBebida() {}

	public ConsumoBebida(Bebidas bebida, int quantidade) {
		this.bebida = bebida;
		this.quantidade = quantidade;
	}

	public Bebidas getBebida() {
		return bebida;
	}

	public void setBebida(Bebidas bebida) {
		this.bebida = bebida;
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
