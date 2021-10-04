package atividade;
import java.util.Locale;
import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int opcao;
		String busca = "";
		String produtos[] = { "Guarana", "Coca-cola", "Doritos", "Coxinha", "Pastel", "Acai", "Suco", "Sorvete",
				"Milk-shake", "Bala" };
		float valores[] = { (float) 3.50, (float) 4.00, (float) 4.50, (float) 3.50, (float) 3.00, (float) 10.00,
				(float) 3.50, (float) 2.50, (float) 7.50, (float) 0.10 };

		do {
			System.out.println("1. Buscar produto\n2.Sair");
			opcao = sc.nextInt();

			if (opcao == 1) {

				System.out.print("Insira o nome do produto: ");
				sc.nextLine();
				busca = sc.nextLine();

				if (buscaFunc(produtos, busca))
					printProduto(produtos, busca, valores);
				else
					System.out.println("Produto nao encontrado!");

			} else if (opcao > 2 || opcao < 1) {
				System.out.println("Opcao invalida!");
			}

		} while (opcao != 2);

		sc.close();

	}

	public static boolean buscaFunc(String produtos[], String busca) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i].toLowerCase().replace('-',' ').contains(busca.toLowerCase()))
				return true;

		}
		return false;
	}

	public static void printProduto(String produtos[], String busca, float valores[]) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i].toLowerCase().replace('-',' ').contains(busca.toLowerCase())) {
				System.out.println("--------------------------------");
				System.out.println("Produto encontrado: ");
				System.out.printf("%s: %.2f\n", produtos[i], valores[i]);
				System.out.println("--------------------------------");
				
			}
		}
	}
}
