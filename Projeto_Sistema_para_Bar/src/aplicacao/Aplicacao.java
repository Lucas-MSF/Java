package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.BebidaAlcoolicas;
import entidades.Bebidas;
import entidades.Cliente;
import entidades.Comida;
import entidades.Funcionario;
import entidades.Mesa;
import entidades_enum.Status;

public class Aplicacao {

	static Scanner sc = new Scanner(System.in);
	static Mesa[] mesas = new Mesa[10];
	static List<Bebidas> bebidas = new ArrayList<>();
	static List<Comida> comidas = new ArrayList<>();
	static List<Cliente> clientes = new ArrayList<>();
	static List<Funcionario> funcionarios = new ArrayList<>();
	static boolean resp = true;

	public static void main(String[] args) {

		for (int i = 0; i < mesas.length; i++)
			mesas[i] = new Mesa();

		bebidas.add(new BebidaAlcoolicas(4.7, "Alcoolica", 350, 4.00, 1, "cerveja litrinho", "Devassa"));
		bebidas.add(new BebidaAlcoolicas(10.0, "Alcoolica", 400, 8.00, 2, "Caipirinha", "Ice"));
		bebidas.add(new Bebidas("Refrigetante", 350, 5.00, 3, "Refrigerante lata", "coca-cola"));

		comidas.add(new Comida(1, "porcao", 2, 25.00, "Batata Frita"));
		comidas.add(new Comida(2, "Fritura", 1, 7.00, "Pastel"));
		comidas.add(new Comida(3, "porcao", 2, 10.00, "Porcao coxinha"));

		clientes.add(new Cliente("Joao", "111.111.111-11", "97777-7777"));
		clientes.add(new Cliente("Lucas", "222.222.222-22", "98888-8888"));
		clientes.add(new Cliente("Marcos", "333.333.333-33", "99999-9999"));

		funcionarios.add(new Funcionario("Kleber", "444.444.444-44", "91111-1111", 1200.00));
		funcionarios.add(new Funcionario("Maria", "555.555.555-55", "92222-2222", 1500.00));
		funcionarios.add(new Funcionario("Mario", "666.666.666-66", "93333-3333", 1250.00));

		do {
			opcoesMenu(menu());
		} while (resp == true);

	}

	static public int menu() {
		int opcao;
		System.out.println("========== Menu ==========");
		System.out.println("1- Abrir mesa;");
		System.out.println("2- Adcionar consumo em uma mesa;");
		System.out.println("3- Verificar status das mesas;");
		System.out.println("4- Gerar conta de uma mesa;");
		System.out.println("5- Fechar mesa;");
		System.out.println("6- Cadastrar;");
		System.out.println("7- Ver clientes cadastrados;");
		System.out.println("8- Ver itens cadastrados;");
		System.out.println("9- Ver funcionarios cadastrados;");
		System.out.println("0- Sair");
		opcao = sc.nextInt();
		return opcao;

	}

	static public void opcoesMenu(int opcao) {

		switch (opcao) {

		case 1:
			abrirMesa();
			break;

		case 2:
			addConsumo();
			break;

		case 3:
			verificarStatusMesa();
			break;

		case 4:
			gerarContaMesa();
			break;

		case 5:
			fecharMesa();
			break;
		case 6:
			cadastrar();
			break;
		case 7:
			mostrarCliente();
			break;
		case 8:
			mostrarItens();
			break;
		case 9:
			mostrarFuncionarios();
			break;
		case 0:
			resp = false;
			break;

		}

	}

	static public void abrirMesa() {

		Cliente clienteC = new Cliente();
		Funcionario funcionarioC = new Funcionario();
		System.out.print("Insira o numero da mesa: ");
		int mesa = sc.nextInt();
		if (mesas[mesa - 1].getStatus().equals(Status.valueOf("LIVRE"))
				|| mesas[mesa - 1].getStatus().equals(Status.valueOf("FECHADA"))) {
			System.out.print("Insira o nome do cliente: ");
			sc.nextLine();
			String cliente = sc.nextLine();
			System.out.print("Insiera o funcionario responsavel pela mesa: ");
			String funcionario = sc.nextLine();
			for (Cliente x : clientes) {
				if (x.getNome().equals(cliente))
					clienteC = x;
			}
			for (Funcionario x : funcionarios) {
				if (x.getNome().equals(funcionario))
					funcionarioC = x;
			}
			mesas[mesa - 1] = new Mesa(mesa, Status.valueOf("OCUPADA"), clienteC, funcionarioC);
		} else {
			System.out.println("Mesa ocupada.");
			opcoesMenu(1);
		}

	}

	static public void addConsumo() {

		System.out.println("Em qual mesa deseja adcionar o consumo?");
		for (int i = 0; i < mesas.length; i++)
			System.out.println("- Mesa " + (i + 1));
		int mesa = sc.nextInt();
		if (mesa < 1 && mesa > 10) {
			System.out.println("Mesa Invalida");
			opcoesMenu(2);
		} else {
			if (mesas[mesa - 1].getStatus().equals(Status.valueOf("OCUPADA"))) {
				System.out.println("O que deseja adcionar?");
				System.out.println("1- Comida");
				System.out.println("2- Bebida");
				int resposta = sc.nextInt();
				if (resposta == 1) {
					System.out.println("Qual comida vc deseja adcionar?");
					for (Comida x : comidas) {
						int i = 1;
						System.out.println(i + "- " + x.getNome());
						i++;
					}
					sc.nextLine();
					String comida = sc.nextLine();
					System.out.print("Insira a quantidade que deseja inserir: ");
					int quantidade = sc.nextInt();
					for (Comida x : comidas) {
						if (x.getNome().equals(comida)) {
							mesas[mesa - 1].addConsumoComida(x, quantidade);
						}
					}

				} else if (resposta == 2) {
					System.out.println("Qual bebida vc deseja adcionar?");
					for (Bebidas x : bebidas)
						System.out.println(x.getNome());
					sc.nextLine();
					String bebida = sc.nextLine();
					System.out.print("Insira a quantidade que deseja inserir: ");
					int quantidade = sc.nextInt();
					for (Bebidas x : bebidas) {
						if (x.getNome().equals(bebida)) {
							mesas[mesa - 1].addConsumoBebida(x, quantidade);
						}
					}
				}
			}else {
				System.out.println("A mesa não esta ocupada");
			}
		}

	}

	static public void verificarStatusMesa() {
		for (int i = 0; i < mesas.length; i++)
			System.out.println("- Mesa " + (i + 1) + ": " + mesas[i].getStatus());
	}

	static public void gerarContaMesa() {
		System.out.print("Insira o numero da mesa: ");
		int mesa = sc.nextInt();
		if (mesas[mesa - 1].getStatus().equals(Status.valueOf("OCUPADA"))) {
			mesas[mesa - 1].notaFiscal();
		}
	}

	static public void fecharMesa() {
		System.out.print("Insira o numero da mesa que deseja fechar: ");
		int mesa = sc.nextInt();
		if (mesas[mesa - 1].getStatus().equals(Status.valueOf("OCUPADA"))) {
			mesas[mesa - 1].getFuncionario().acrescimoSalario(mesas[mesa - 1].taxaServico());
			mesas[mesa - 1].getCliente().addFidelidade();
			mesas[mesa - 1].setStatus(Status.valueOf("FECHADA"));
		} else {
			System.out.println("A mesa nao pode ser fechada.");
		}
	}

	static public void cadastrar() {
		System.out.println("O que deseja cadastrar?");
		System.out.println("1- Item");
		System.out.println("2- Cliente");
		System.out.println("3- Funcionario");
		System.out.println("0- Sair");
		int opcao = sc.nextInt();
		if (opcao == 1)
			cadastrarItem();
		else if (opcao == 2)
			cadastrarCliente();
		else if (opcao == 3)
			cadastrarFuncionario();
		else if (opcao == 0)
			opcoesMenu(menu());
	}

	static public void cadastrarCliente() {
		boolean verificador = true;
		System.out.print("Insira o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Insira o CPF do cliente: ");
		String cpf = sc.nextLine();
		for (Cliente x : clientes) {
			if (cpf == x.getCpf()) {
				verificador = false;
				System.out.println("Clinte ja cadastrado");
			}
		}
		if (verificador == true) {
			System.out.print("Insira o numero de telefone do clinte: ");
			String telefone = sc.nextLine();
			clientes.add(new Cliente(nome, cpf, telefone));
		}
	}

	static public void cadastrarItem() {
		boolean verificador = true;
		System.out.println("Qual o tipo do item que deseja cadastrar?");
		System.out.println("1- comida");
		System.out.println("2- Bebida");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.print("Insira o codigo do produto: ");
			int codigo = sc.nextInt();
			for (Comida x : comidas)
				if (x.getCodProduto() == codigo)
					verificador = false;
			if (verificador == true) {
				System.out.print("Insira o tipo do produto: ");
				sc.nextLine();
				String tipo = sc.nextLine();
				System.out.print("Insira quantas pessoas o prato serve: ");
				int quantPessoas = sc.nextInt();
				System.out.print("Insira o valor do produto: ");
				double valor = sc.nextDouble();
				System.out.print("Insira o nome do produto: ");
				sc.nextLine();
				String nome = sc.nextLine();
				comidas.add(new Comida(codigo, tipo, quantPessoas, valor, nome));
			}else {
				cadastrarItem();
			}
		} else if (opcao == 2) {
			double teorAlcoolico = 0;

			System.out.print("Insira o codigo do produto: ");
			int codigo = sc.nextInt();
			for (Bebidas x : bebidas)
				if (x.getCodProduto() == codigo)
					verificador = false;
			if (verificador == true) {
				System.out.print("Insira o tipo do produto: ");
				sc.nextLine();
				String tipo = sc.nextLine();
				if (tipo.equals("Alcoolico")) {
					System.out.print("Insira o teor alcoolico da bebida: ");
					teorAlcoolico = sc.nextDouble();
				}
				System.out.print("Insira a litragem da bebida: ");
				int litragem = sc.nextInt();
				System.out.print("Insira o valor do produto: ");
				double valor = sc.nextDouble();
				System.out.print("Insira o nome do produto: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Insira a marca da bebida: ");
				String marca = sc.nextLine();
				if (tipo.equals("Alcoolico"))
					bebidas.add(new BebidaAlcoolicas(teorAlcoolico, tipo, litragem, valor, codigo, nome, marca));
				else
					bebidas.add(new Bebidas(tipo, litragem, valor, codigo, nome, marca));
			}else {
				cadastrarItem();
			}
		}
	}

	static public void cadastrarFuncionario() {
		boolean verificador = true;
		System.out.print("Insira o nome do funcionario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Insira o CPF do funcionario: ");
		String cpf = sc.nextLine();
		for (Funcionario x : funcionarios) {
			if (cpf == x.getCpf()) {
				verificador = false;
				System.out.println("funcionario ja cadastrado");
			}
		}
		if (verificador == true) {
			System.out.print("Insira o numero de telefone do funcionario: ");
			String telefone = sc.nextLine();
			System.out.println("Insira o salario base do funcionario");
			double salarioBase = sc.nextDouble();
			funcionarios.add(new Funcionario(nome, cpf, telefone, salarioBase));
		}
	}

	static public void mostrarCliente() {
		System.out.println("Clientes: ");
		for (Cliente x : clientes)
			System.out.println(x);
	}

	static public void mostrarItens() {
		System.out.println("Itens:");
		System.out.println("Bebidas:");
		for (Bebidas x : bebidas)
			System.out.println(x);
		System.out.println("\nComidas:");
		for (Comida x : comidas)
			System.out.println(x);
	}

	static public void mostrarFuncionarios() {
		System.out.println("Funcionarios: ");
		for (Funcionario x : funcionarios)
			System.out.println(x);
	}
}
