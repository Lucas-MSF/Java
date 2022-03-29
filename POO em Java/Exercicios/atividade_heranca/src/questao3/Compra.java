package questao3;

import java.util.Calendar;

public class Compra {
	
	private Perfume perfume;
	private int quantidade;
	private Calendar dataCompra;
	private double valorCompra;
	private Consultor consultor;
	private Comprador comprador;
	
	public Compra(Perfume perfume, int quantidade, Calendar dataCompra, double valorCompra, Consultor consultor,
			Comprador comprador) {
		this.perfume = perfume;
		this.quantidade = quantidade;
		this.dataCompra = dataCompra;
		this.valorCompra = valorCompra;
		this.consultor = consultor;
		this.comprador = comprador;
	}

	public Perfume getPerfume() {
		return perfume;
	}

	public void setPerfume(Perfume perfume) {
		this.perfume = perfume;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Consultor getConsultor() {
		return consultor;
	}

	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	
	
	
	
	

}
