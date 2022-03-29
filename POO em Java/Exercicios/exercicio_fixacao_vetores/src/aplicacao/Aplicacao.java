package aplicacao;

import java.util.Scanner;

import entidades.Alugueis;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.print("Informe quantos quartos deseja alugar: ");
		int n= sc.nextInt();
		
		Alugueis[] alugueis= new Alugueis[10];
		
		for(int i=0; i<n ; i++) {
			sc.nextLine();
			System.out.print("Informe o nome do locador: ");
			String nome= sc.nextLine();
			System.out.print("Infome o email do locador: ");
			String email= sc.nextLine();
			System.out.print("Informe o numero do quarto alugado: ");
			int quarto= sc.nextInt();
			alugueis[quarto]= new Alugueis(nome,email,quarto);
			System.out.println(" ");
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i=0; i<alugueis.length; i++) {
			if(alugueis[i]!= null)
				System.out.println(alugueis[i]);
		}
		
		sc.close();
	}

}
