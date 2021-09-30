package atividade;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		
		Scanner ent= new Scanner(System.in);
		
		int[] numeros= new int[6];
		int[] pares= new int[6];
		int[] impar= new int[6];
		int aux=0;
		int soma= 0;
		int aux2= 0;
		
		
		for(int i=0; i<6;i++) {
			numeros[i]= ent.nextInt();
			if(numeros[i] % 2 ==0) {
				pares[aux]= numeros[i];
				aux++;
			}
			else {
				impar[aux2]= numeros[i];
				aux2++;
			}
		}
		
		System.out.print("Os numeros pares são: ");
		
		for(int i=0; i<aux;i++) {
			System.out.print(" " + pares[i]);
			soma= pares[i]+soma;
		}
		
		System.out.println( "");
		System.out.println( "A soma deles é: " + soma);
		System.out.print("Os numeros impares são: ");
		for(int i=0; i<aux2;i++) {
			System.out.print(" " + impar[i]);
		}
		System.out.println( "");
		System.out.println( "A quantidade de numeros impares é: " + aux2);
	}

}
