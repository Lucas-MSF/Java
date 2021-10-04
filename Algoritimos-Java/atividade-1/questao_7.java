package atividade;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int contador=0, numeros;
		
		System.out.println("Insira valores aleatorios, insira o valor 0 para parar: ");
		do {
			numeros= sc.nextInt();
			if(numeros>=100 && numeros<=200)
				contador++;
		}while(numeros!=0);
		
		System.out.println("Quantidade de numeros >= 100 e <= 200: "+contador);
		
		sc.close();
	}

}
