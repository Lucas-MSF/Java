package questao_10;

import java.util.Scanner;

public class Aplicacao {

	static public Scanner sc = new Scanner(System.in);
	static private String produto[] = { "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1" };
	static private float preco[] = new float[10];
	static private int quantidade[] = new int[10];

	public static void main(String[] args) {

		int opcao;

		do {

			System.out.println("-----Menu-----");
			System.out.println("1. Inserir produto.");
			System.out.println("2. Pesquisar produto.");
			System.out.println("0. sair.");
			opcao = sc.nextInt();

			if (opcao == 1)
				inserirProduto();
			else if (opcao == 2)
				procurarProduto();
			else if (opcao > 2 && opcao < 0)
				System.out.println("Opcao invalida!");

		} while (opcao != 0);

	}

	public static void inserirProduto() {
		
		for (int i = 0; i < produto.length; i++) {
			if (produto[i] == "-1" || produto[i] == "-2") {
				System.out.println("Insira o nome do produto: ");
				produto[i] = sc.next();
				System.out.println("Insira o preco do produto: ");
				preco[i] = sc.nextFloat();
				System.out.println("Insira a quantidade do produto: ");
				quantidade[i] = sc.nextInt();
				break;
			}
		}

	}

	public static void procurarProduto() {
		String busca;
		System.out.println("Insira o nome do produto q deseja procurar: ");
		busca = sc.next();
		for (int i = 0; i < produto.length; i++) {
			if (produto[i].equals(busca)) {
				System.out.println("Produto:");
				System.out.println("nome:" + produto[i]);
				System.out.println("Preco:" + preco[i]);
				System.out.println("Quantidade:" + quantidade[i]);
				break;
			}

		}
	}

}
