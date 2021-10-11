package Atividade2;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaCompra {

	static public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {

		Locale.setDefault(Locale.US);

		String clientes[] = { "", "", "", "", "", "", "", "", "", "" };
		String produtos[] = { "Feijao", "Acucar", "Arroz", "Macarrao", "Café" };
		float precos[] = { (float) 4.50, (float) 3.50, (float) 6.00, (float) 3.25, (float) 4.25 };
		int quantidade[] = { 50, 40, 55, 35, 20 };
		float caixa = 0;
		int opcao, opcao_venda, quantidade_venda;

		while (login() == false) {
			System.out.println("Senha ou usuario invalidos!");
			pause();
			limparTela();
		}

		do {
			limparTela();
			menu();

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				mostrarEstoque(produtos, precos, quantidade);
				pause();
				break;
			case 2:
				mostrarCliente(clientes);
				pause();
				break;
			case 3:
				for (int i = 0; i < clientes.length; i++) {
					if (clientes[i] == "") {
						clientes[i] = cadastrarCliente();
						break;
					}
				}
				break;
			case 4:
				System.out.printf("Valor no caixa: %.2f \n", caixa);
				pause();
				break;
			case 5:
				System.out.print("Digite o ID do produto que deseja comprar: ");
				opcao_venda = sc.nextInt() - 1;
				if (opcao_venda >= 0 && opcao_venda <= 4) {
					System.out.print("Informe a quantidade: ");
					quantidade_venda = sc.nextInt();
					if (quantidade_venda > 0 && quantidade_venda <= quantidade[opcao_venda]) {
						recibo(produtos[opcao_venda], precos[opcao_venda], quantidade_venda);
						if (confirmaCompra()) {
							compraNomeCliente(clientes);
							quantidade[opcao_venda] -= quantidade_venda;
							caixa += precos[opcao_venda] * quantidade_venda;
						} else {
							System.out.println("Compra Cancelada!");
							pause();
						}
					} else {
						System.out.println("Quantidade Invalida!");
						pause();
					}
				} else {
					System.out.println("Opcao Invalida!");
					pause();
				}

				break;
			case 6:
				limparTela();
				break;
			case 7:
				System.out.println("Encerrando sistema...");
				break;
			default:
				System.out.println("Opcao Invalida!");
				pause();
				break;
			}

		} while (opcao != 7);
		sc.close();
	}

	public static boolean login() {
		String usuario = "admin", usuarioDigitado, senha = "123", senhaDigitada;

		System.out.print("Login: ");
		usuarioDigitado = sc.next();
		System.out.print("Senha: ");
		senhaDigitada = sc.next();

		if (usuarioDigitado.contains(usuario) && senhaDigitada.contains(senha))
			return true;
		else
			return false;
	};

	public static void menu() {
		System.out.println("- - - - - - - M E N U - - - - - - -");
		System.out.println("1- Mostrar produtos em estoque");
		System.out.println("2- Mostrar clientes");
		System.out.println("3- Cadastrar novo cliente");
		System.out.println("4- Mostrar dinheiro em caixa");
		System.out.println("5- Vender produto");
		System.out.println("6- Limpar tela");
		System.out.println("7- Sair");
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.print(">> ");
	}

	public static void mostrarEstoque(String produtos[], float precos[], int quantidade[]) {
		for (int i = 0; i < produtos.length; i++)
			System.out.printf("id %d- Produto: %s - Preco: %.2f - Quantidade em estoque: %d\n", i + 1, produtos[i],
					precos[i], quantidade[i]);
		System.out.println("");

	}

	public static void mostrarCliente(String clientes[]) {
		for (int i = 0; i < clientes.length; i++)
			System.out.printf("ID %d: %s\n", i + 1, clientes[i]);
	}

	public static String cadastrarCliente() {
		String nome = "";
		System.out.print("Insira o nome do cliente que deseja inserir:");
		sc.nextLine();
		nome = sc.nextLine();
		return nome;
	}

	public static boolean confirmaCompra() {
		System.out.println("Deseja confirmar a compra?0.Sim 1.Nao");
		int resposta = sc.nextInt();
		if (resposta == 0)
			return true;
		else
			return false;
	}

	public static void recibo(String produto, float preco, int quantidade_venda)
			throws IOException, InterruptedException {
		limparTela();
		DateTimeFormatter data_venda = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter hora_venda = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("---------------R E C I B O---------------");
		System.out.println("Produto: " + produto);
		System.out.println("Quantidade: " + quantidade_venda);
		System.out.printf("Valor por unidade: %.2f \n", preco);
		System.out.printf("Total: %.2f \n", preco * quantidade_venda);
		System.out.println("Data: " + data_venda.format(LocalDateTime.now()));
		System.out.println("Hora: " + hora_venda.format(LocalDateTime.now()));
		System.out.println("------------------------------------------");
	}

	public static void compraNomeCliente(String clientes[]) throws IOException, InterruptedException {

		System.out.println("Deseja efetuar a compra no ID de um cliente?(0.Sim 1.Nao)");
		int resposta = sc.nextInt();

		if (resposta == 0) {

			System.out.println("Insira um ID valido de cliente: ");
			int id = sc.nextInt();

			if (verificaCliente(clientes, id)) {
				System.out.println("Compra confirmada no nome do cliente: " + clientes[id - 1]);
				pause();
			} else {
				System.out.println("Codigo de cliente invalido!");
				pause();
				limparTela();
				compraNomeCliente(clientes);
			}
		} else if (resposta == 1) {
			System.out.println("Compra realizada com sucesso!");
			pause();
		} else {
			System.out.println("Opcao invalida!");
			pause();
			limparTela();
			compraNomeCliente(clientes);
		}
	}

	public static boolean verificaCliente(String clientes[], int id) {
		if (clientes[id - 1] != "")
			return true;
		else
			return false;
	}

	public static void limparTela() throws IOException, InterruptedException {
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
	}

	public static String pause() {

		System.out.println("Sistema pausado, digite qualquer coisa para continuar: ");
		String pause;
		pause = sc.next();
		return pause;
	}

}
