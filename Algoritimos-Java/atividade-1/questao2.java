package atividade;

import java.util.Scanner;

public class questao2{
	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int numeros[]= new int[20];
	
		for(int i=0;i<20;i++) {
			numeros[i]= ent.nextInt();
		}
		System.out.println("Crescente --------------");
		for(int i=0;i<20;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("Decrescente --------------");
		for(int i=19;i>=0;i--) {
			System.out.println(numeros[i]);
		}
	}
}
