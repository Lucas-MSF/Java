package atividade;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int numeros,maior=0,menor=0;
		
		System.out.println("Insira 10 valores aleatorios: ");
		
		for(int i=0;i<10;i++){
			numeros= sc.nextInt();
			
			if(menor==0)
				menor=numeros;
			
			if(numeros>maior)
				maior=numeros;
			
			else if(numeros<menor)
				menor=numeros;
		}
		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
	}
}
