package carro;

public class Carro {
	private String modelo;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private Motor motor;
	
	public Motor getMotor() {
		return motor; 
	}
	
	public void setMotor() {
		this.motor = motor;
	}
	
	public Carro() {
		this.modelo = "Carro qualquer";
		this.velocidadeMaxima = 120;
		this.velocidadeAtual = 0; 
	}
	
	public Carro(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public Carro(String modelo, int velocidadeMaxima, Motor motor) {
		this.velocidadeMaxima = velocidadeMaxima;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void ligarCarro() {
		System.out.println("O carro está ligado. ");
	}
	
	public void desligarCarro() {
		System.out.println("O carro está desligado. ");
	}
	
	public void acelera(int veloc) {
		if(this.velocidadeAtual + veloc <= this.velocidadeMaxima) {
			this.velocidadeAtual += veloc;
			System.out.println("acelerando, Velocidade atual: "+this.velocidadeAtual);
		}else {
			this.velocidadeAtual = this.velocidadeMaxima;
			System.out.println("Velocidade maxima atingida! \n"+
			"Velocidade atual: "+this.velocidadeAtual);
		}
	}
	
	public void reduzir(int veloc) {
		if((this.velocidadeAtual - veloc) > 0) {
			this.velocidadeAtual -= veloc;
			System.out.println("reduzindo, Velocidade atual: " + this.velocidadeAtual);
		}else {
			pararCarro();
		}
	}
	
	public void pararCarro() {
		this.velocidadeAtual = 0;
		System.out.println("O carro parou, Velocidade Atual: "+this.velocidadeAtual);
	}
}
