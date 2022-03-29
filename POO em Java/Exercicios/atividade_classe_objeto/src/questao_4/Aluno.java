package questao_4;

import java.util.Scanner;

public class Aluno {
	Scanner sc= new Scanner(System.in);
	private String nome;
	private int numeroMatricula;
	private float nota1,nota2,nota3;
	
	public void setAluno() {
		System.out.println("Insira o nome:");
		nome= sc.next();
		System.out.println("Insira o numero de matricula:");
		numeroMatricula= sc.nextInt();
		System.out.println("Insira a nota 1:");
		nota1= sc.nextFloat();
		System.out.println("Insira a nota 2:");
		nota2=sc.nextFloat();
		System.out.println("Insira a nota 3:");
		nota3=sc.nextFloat();
	}
	public void getAluno() {
		System.out.println("--------------------------");
		System.out.println("nome:"+nome);
		System.out.println("numero de matricula:"+numeroMatricula);
		System.out.println("nota 1:"+nota1);
		System.out.println("nota 2:"+nota2);
		System.out.println("nota 3:"+nota3);
		System.out.println("--------------------------");
	}	
	
	public void mediaAluno() {
		System.out.println("Media do aluno: "+ ((nota1+nota2+nota3)/3));
	}

}
