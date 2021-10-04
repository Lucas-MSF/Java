package atividade;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
		int iguais[] = new int[10];
		int contador = 0;

		System.out.print("Insira 10 numeros diferentes de 0: ");
		for (int i = 0; i < 10; i++)
			vetor[i] = sc.nextInt();

		// loop para verificar os repetidos
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (vetor[i] == vetor[j] && i != j) {
					if (verificador(iguais, vetor[i])) {
						iguais[contador] = vetor[i];
						contador++;

					}
				}
			}
		}
		// Printando a variavel iguais
		System.out.println("Valores repetidos: ");
		for (int i = 0; i < contador; i++) {
			if (iguais[i] != 0)
				System.out.print(iguais[i] + " ");
		}
		sc.close();
	}

	//funcao para verificar se o numero ja existe no vetor "iguais"
	public static boolean verificador(int iguais[], int valor) {
		for (int i = 0; i < 10; i++) {
			if (iguais[i] == valor)
				return false;
		}
		return true;
	}
}