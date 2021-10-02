package atividade;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int vetor1[]= new int[10];
		int vetor2[]= new int[10];
		int vetor3[]= new int[10];
		
		System.out.print("Insira 10 valores para o primeiro vetor: ");
		for(int i=0;i<10;i++)
			vetor1[i]= sc.nextInt();
		
		System.out.print("Insira 10 valores para o segundo vetor: ");
		for(int i=0;i<10;i++)
			vetor2[i]= sc.nextInt();
		
		for(int i=0;i<10;i++)
			vetor3[i]= vetor1[i] * vetor2[i];
		System.out.println("Terceiro vetor com o produto da mutiplicacao entre os valores\n"
				+ "de mesmo indice dos vetores 1 e 2:");
		for(int i=0;i<10;i++)
			System.out.print(vetor3[i]+ " ");
		sc.close();
	}
}