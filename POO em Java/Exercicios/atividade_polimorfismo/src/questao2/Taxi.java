package questao2;

public class Taxi extends Carro {
	
	private String licença;
	private double taxaAnual;
	
	public Taxi(String modelo, int velocidadeMaxima, Motor motor, double preco,  String licensa, double taxaAnual) {
		super(modelo, velocidadeMaxima, motor, preco);
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
	public double getValorVenda() {
		double deprec = 0.75;
		return this.getPreco() * deprec;
	}
	
}
