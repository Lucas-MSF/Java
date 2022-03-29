package questao_8;

import java.util.Scanner;

public class Medico {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private int registroCRM;
	private int cpf;
	
	
	public void setMedico() {
		System.out.println("Informe o nome do medico: ");
		nome = sc.next();
		System.out.println("Informe o registro CRM do medico: ");
		registroCRM = sc.nextInt();
		System.out.println("Informe o CPF do medico: ");
		cpf = sc.nextInt();
	}
	
	public void getMedico() {
		System.out.println("Nome: "+ nome);
		System.out.println("Registro CRM: "+ registroCRM);
		System.out.println("CPF: "+ cpf);
	}
	
	public String analisarSintoma(String sintomas) {
		String doenca= "Dor de cabeca";
		return doenca;
	}
	
	public String receitarRemedio(String doenca) {
		String remedio="charope";
		return remedio;
	
	}
		
}
