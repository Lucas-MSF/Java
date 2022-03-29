package carro;

public class Taxi extends Carro {
	
	private String licença;
	private double taxaAnual;
	
	public Taxi(String modelo, int velocidadeMaxima, Motor motor, String licensa, double taxaAnual) {
		super(modelo, velocidadeMaxima, motor);
		this.licença = licensa;
		this.taxaAnual = taxaAnual;
	}
	
	public String getLicença() {
		return licença;
	}
	public void setLicença(String licença) {
		this.licença = licença;
	}
	public double getTaxaAnual() {
		return taxaAnual;
	}
	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}
	
}
