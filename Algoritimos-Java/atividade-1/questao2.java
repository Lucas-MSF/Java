package atividade;
import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vet[]=new int[20];
		int aux=0;
		int vetorOrganizado[]=new int[20];
		System.out.println("Insira 20 numeros no Vetor:");
		for (int i=0;i<20;i++)
			vet[i]= sc.nextInt();
		
		System.out.println("vetor digitado:");
		for (int i=0;i<20;i++)
			System.out.print(vet[i]+" ");

	//Organizando o vetor inserido para mostrar os valores inseridos em forma decrescente
		
		vetorOrganizado=vet;
		
		for (int i=0;i<20;i++) {
			for (int j=0;j<20;j++) {
				if(vetorOrganizado[i]<vetorOrganizado[j]) {
					aux=vetorOrganizado[i];
					vetorOrganizado[i]= vetorOrganizado[j];
					vetorOrganizado[j]= aux;
				}
			}
		}
					
		System.out.println("\nvetor digitado em ordem decrescente:");
		for(int i=19;i>=0;i--) 
				System.out.print(vetorOrganizado[i]+" ");

	}

}