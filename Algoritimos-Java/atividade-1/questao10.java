package atividade;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numeros[]=new int[6];
		String pares="";
		String impares="";
		int soma=0, contador=0;
		
		
		System.out.print("Insira 6 numeros: ");
		for (int i=0;i<6;i++)
			numeros[i]= sc.nextInt();
		
		for (int i=0;i<6;i++) {
			if(numeros[i]%2==0) {
				soma+=numeros[i];
				pares+= numeros[i]+" ";
			}else {
				contador++;
				impares+= numeros[i]+" ";
			}
				
		}
		System.out.println("Numeros pares: "+ pares);
		System.out.println("Soma dos numeros pares: "+ soma);
		System.out.println("Numeros impares: "+ impares);
		System.out.println("Quantidade de numeros impares: "+contador);
		sc.close();
		
	}

}
