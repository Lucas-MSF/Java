package atividade;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nomes[] = { "", "", "", "", "", "", "", "", "", "" };
		int opcao;

		do {
			System.out.println("0. Ver clientes cadastrados");
			System.out.println("1. Cadastrar cliente");
			System.out.println("2. Sair");
			System.out.print(">>");
			opcao = sc.nextInt();

			if (opcao == 0) {
				System.out.println("---------------------------------");
				for (int i = 0; i < 10; i++) {
					if (nomes[i] != "")
						System.out.println(i + ". " + nomes[i]);
				}
				System.out.println("---------------------------------");
			} else if (opcao == 1) {
				for (int i = 0; i < 10; i++) {
					if (nomes[i] == "") {
						System.out.print("Nome:");
						sc.nextLine();
						nomes[i] = sc.nextLine();
						break;
					}
				}
			}

		} while (opcao != 2);
		sc.close();
	}
}