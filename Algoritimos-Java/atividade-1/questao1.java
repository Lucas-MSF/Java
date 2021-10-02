package atividade;

import java.util.Scanner;

public class questao1 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		float notas[]= new float[5];
		float media=0;
		System.out.println("Digite o valor das 5 notas: ");
		
		for(int i=0;i<5;i++) {
			notas[i]= sc.nextFloat();
			media += notas[i];
		}
		media/=5;
		System.out.printf("A media das notas inseridas e de: %.2f", media);
		
		sc.close();
		
	}
}
