package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Alunos;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Alunos aluno= new Alunos();
		
		System.out.print("Insira o nome do aluno:");
		aluno.nome= sc.nextLine();
		System.out.print("Insira o nota 1: ");
		aluno.nota1=sc.nextFloat();
		System.out.print("Insira o nota 2: ");
		aluno.nota2=sc.nextFloat();
		System.out.print("Insira o nota 3: ");
		aluno.nota3=sc.nextFloat();
		
		System.out.printf("Media: %.2f \n",aluno.media());
		aluno.verificaSePassou();
		
		sc.close();
	}

}
