package atividade;

import java.util.Scanner;

public class questao4 {
	public static void main(String[] args) {
	 
		Scanner ent= new Scanner(System.in);
		
		int numeros[]= new int[10];
		int maior=0;
		
		for(int i=0; i<10;i++) {
			
			numeros[i]= ent.nextInt();
		}
		
		int menor=numeros[0];
		
		for(int i=0; i<10;i++) {
			
			if(numeros[i]>maior) {
				maior= numeros[i];
			}
			
			if(menor>numeros[i]) {
				menor= numeros[i];		
			}
		}
		
		System.out.println("O menor numero é:" + menor);
		
		System.out.println("O maior numero é:" + maior);
	}
}
