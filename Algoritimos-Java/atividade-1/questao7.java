package atividade;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		
		Scanner ent= new Scanner(System.in);
		
		int i=1;
		int[] numeros= new int[i];
		int aux=1;
		int contador=0;
		
		System.out.println("Insira numeros aleatorios e quando desejar parar insira o numero 0.");

		while(aux!=0){
			int x=0;
			numeros[x]= ent.nextInt();
			aux= numeros[x];
			if(numeros[x]>= 100 && numeros[x] <= 200) {
				contador++;
			}
			i++;
			x++;	
		}
		System.out.println("A quantidade de numeros entre 100 e 200 é: "+ contador);
	}

}
