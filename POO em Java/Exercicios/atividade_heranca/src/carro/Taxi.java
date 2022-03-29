package carro;

public class Taxi extends Carro {
	
	private String licen�a;
	private double taxaAnual;
	
	public Taxi(String modelo, int velocidadeMaxima, Motor motor, String licensa, double taxaAnual) {
		super(modelo, velocidadeMaxima, motor);
		this.licen�a = licensa;
		this.taxaAnual = taxaAnual;
	}
	
	public String getLicen�a() {
		return licen�a;
	}
	public void setLicen�a(String licen�a) {
		this.licen�a = licen�a;
	}
	public double getTaxaAnual() {
		return taxaAnual;
	}
	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}
	
}
