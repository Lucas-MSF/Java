package atividade;

import java.util.Random;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Random rd= new Random();
		
		int numeros[]= new int[10];
		int maior=0,menor=0;
		
		for(int i=0;i<10;i++){
			numeros[i]= rd.nextInt(50);
			
			if(menor==0)
				menor=numeros[i];
			
			if(numeros[i]>maior)
				maior=numeros[i];
			
			else if(numeros[i]<menor)
				menor=numeros[i];
		}
		System.out.print("valores aleatorios entre 0 e 50: {");
		for(int i=0;i<10;i++)
			System.out.print(" " +numeros[i]);
		System.out.println(" }");
		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
		
		sc.close();
	}
}
