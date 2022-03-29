package questao_9;

import java.util.Scanner;

public class Carro {
	
	Scanner sc= new Scanner(System.in);
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	
	public void setCarro() {
		System.out.println("Insira o modelo do carro: ");
		modelo= sc.next();
		System.out.println("Insira a marca do carro: ");
		marca= sc.next();
		System.out.println("Insira a placa do carro: ");
		placa= sc.next();
		System.out.println("Insira a cor do carro: ");
		cor= sc.next();
	}
	public void getCarro() {
		System.out.println("Modelo: "+ modelo);
		System.out.println("Marca: "+ marca);
		System.out.println("Placa: "+ placa);
		System.out.println("Cor: "+ cor);
	}
	public void ligarCarro() {
		System.out.println("Ligando carro... vrum vrum");
	}
	public void desligarCarro() {
		System.out.println("Desligando carro...");
	}
}
