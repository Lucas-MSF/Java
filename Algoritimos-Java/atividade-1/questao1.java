package atividade;

import java.util.Scanner;

public class questão1 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		float Pontos[] = new float[5];
		float Soma=0;
		
		for(int i= 0 ;i <5 ; i++ ) {
			Pontos[i]= ent.nextFloat();
			Soma= Pontos[i]+Soma;
		}
		float resultado= Soma/5;
		System.out.println("sua media final é:"+ resultado);
	}
}
