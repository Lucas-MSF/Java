package questao2;

public class Taxi extends Carro {
	
	private String licen�a;
	private double taxaAnual;
	
	public Taxi(String modelo, int velocidadeMaxima, Motor motor, double preco,  String licensa, double taxaAnual) {
		super(modelo, velocidadeMaxima, motor, preco);
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
	public double getValorVenda() {
		double deprec = 0.75;
		return this.getPreco() * deprec;
	}
	
}
