package questao_9;

import java.util.Scanner;

public class Motorista {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private int cnh;
	private int cpf;
	private String tipoHabilitacao;

	public void setMotorista() {
		System.out.println("Insira o nome do motorista: ");
		nome = sc.next();
		System.out.println("Insira a CNH do motorista: ");
		cnh = sc.nextInt();
		System.out.println("Insira o CPF do motorista: ");
		cpf = sc.nextInt();
		System.out.println("Insira o tipo da habilitacao do motorista: ");
		tipoHabilitacao = sc.next();
	}

	public void getMotorista() {
		System.out.println("Nome: " + nome);
		System.out.println("CNH: " + cnh);
		System.out.println("CPF: " + cpf);
		System.out.println("Tipo de Habilitacao: " + tipoHabilitacao);
	}

	public void dirigir() {
		System.out.println("Dirigindo...");
	}

	public void lavarCarro() {
	 System.out.println("Lavando carro...");
	}
}
