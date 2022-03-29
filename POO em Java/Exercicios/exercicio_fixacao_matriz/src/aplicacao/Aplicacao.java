package aplicacao;

import java.util.Scanner;

import entidades.Operacoes;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Insira a quantidade de linhas da matriz:");
		int linhas=sc.nextInt();
		System.out.print("Insira a quantidade de colunas da matriz: ");
		int colunas= sc.nextInt();
		
		int[][] matriz= new int[linhas][colunas];
		
		System.out.print("Insira os elementos da matriz: ");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Insira o numero q deseja procurar: ");
		int num=sc.nextInt();
		
		Operacoes.verifica(matriz,num);
		sc.close();
	}

}
