package atividade;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		
		String iguais = "";
		int local;
		int[] vetor = new int[10];
		int aux;
		Scanner ent = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			vetor[i]=ent.nextInt();
		}
		
		for (int i=0;i<10;i++) {
			aux=vetor[i];
			local=i;
			for (int x=0;x<10;x++) {
				if(vetor[x]== aux && local != x && local<x) {			
					iguais+=aux+"\n";
				}
			}
		}
		
		System.out.println("Numeres que repetiram: \n" + iguais);
		
	}

}
