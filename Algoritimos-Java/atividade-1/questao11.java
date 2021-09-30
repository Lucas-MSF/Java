package atividade;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		String[] produtos = {"Agua", "Halls", "Salgadinho", "Bolacha",
				"Paçoca", "Pastel", "Coxinha", "Trident", "Guaraná", "Coca-cola"};
		
		float[] valor = {(float) 2.0, (float) 1.0, (float) 1.5, (float) 5.0,
				(float) 0.50, (float) 2.75, (float) 3.50, (float) 2.0,
				(float) 1.50, (float) 3.0};
		
		String busca;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Lanchonete - digite 'sair' para encerrar");
		for(int i  = 0; i  < i+1; i++) {
			System.out.println("digite nome do produto: ");
			busca = ent.next();
			
			if(busca.contains("sair")) {
				System.exit(0);
			}
			
			for(int x = 0; x < 10; x++) {
				
				if(produtos[x].contains(busca)) {
					System.out.println("o "+ produtos[x] + " custa: R$ " + valor[x]);
				}
			}
		}

	}

}
