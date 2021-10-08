package entidades;

public class Funcionario {
	
	public String nome;
	public float salario;
	public float taxa;
	
	public double salarioLiquido() {
		return salario-taxa;
	}
	public void salarioAdcional(double porcentagem) {
		double salarioAtual= salarioLiquido() + (salario*(porcentagem/100));
		System.out.printf("Salario com adcional: %s, $ %.2f",nome, salarioAtual);
	}
	
}
