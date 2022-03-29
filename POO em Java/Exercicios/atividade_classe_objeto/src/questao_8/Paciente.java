package questao_8;

import java.util.Scanner;

public class Paciente {
	Scanner sc= new Scanner(System.in);
	private String nome;
	private int cpf;
	private int idade;
	
	public void setPaciente() {
		System.out.println("Insira o nome do paciente: ");
		nome= sc.next();
		System.out.println("Insira o CPF do paciente: ");
		cpf=sc.nextInt();
		System.out.println("Insira a idade do paciente: ");
		idade=sc.nextInt();
	}
	
	public void getPaciente() {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Idade: "+idade);
	}
	
	public String descreverSintomas() {
		String sintoma= "Dor de cabeca";
		return sintoma;
	}
}
