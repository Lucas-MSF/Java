package atividade;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		String[] clientes = new String[10];
		
		while(true){
			System.out.println("1. Ver clientes cadastrados");
			System.out.println("2. Cadastrar um novo cliente");
			System.out.println("3. Sair do progama");
			System.out.println("digite opção: ");
			
			int opcao = 0;
			opcao = ent.nextInt();
			switch (opcao) {
				case 1:
					System.out.println("---- Usuarios cadastrado ----\n");
					for (int i = 0;i < clientes.length; i++) {
						if (clientes[i] != null) {		
							System.out.printf("Cliente %d ---- %s",(i+1),clientes[i]);
							System.out.println("\n");
						}
					}
					break;
				case 2:
					for (int i = 0;i < clientes.length; i++) {
						if (clientes[i] == null) {
							System.out.print("\n Novo cliente: ");
							clientes[i] = entrada.nextLine();
							System.out.printf("Cliente cadastrado na posição: %d\n",i);	
							break;
						}
					}
					break;
				case 3:
					System.exit(0);
			}
		}

	}

}
