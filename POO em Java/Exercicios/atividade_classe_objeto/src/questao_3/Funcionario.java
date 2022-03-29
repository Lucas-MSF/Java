package questao_3;

import java.util.Scanner;

public class Funcionario {
	Scanner sc= new Scanner(System.in);
	private int cpf;
	private String nome;
	private int idade;
	private String horasDeTrabalho;
	private float salario;
	
	public void setFuncionario() {
		System.out.println("Insira o Nome do funcionario: ");
		nome= sc.next();
		System.out.println("Insira o CPF do funcionario: ");
		cpf= sc.nextInt();
		System.out.println("Insira a idade do funcionario: ");
		idade = sc.nextInt();
		System.out.println("Insira a quantidade de horas de trabalho do funcionario: ");
		horasDeTrabalho= sc.next();
		System.out.println("Insira o salario do funcionario: ");
		salario= sc.nextFloat();
	}
	public void getFuncionario () {
		System.out.println("-----------------------------");
		System.out.println("nome: "+ nome);
		System.out.println("CPF: "+ cpf);
		System.out.println("Idade: "+ idade);
		System.out.println("Horas de trabalho: "+horasDeTrabalho);
		System.out.println("Salario: "+salario);
		System.out.println("-----------------------------");
	}
	public void verificaCargo() {
		if(salario<=1500)
			System.out.println("Cargo: Operario");
		else if(salario >1500 && salario <=4000)
			System.out.println("Cargo: Vendedor");
		else if(salario>4000 && salario <=8000)
			System.out.println("Cargo: Gerente");
		else
			System.out.println("Cargo: Dono");
	}
}
