package exercicio_fixacacao_encapsulamento;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Conta conta;
	
		System.out.print("Insira o nome do Titular: ");
		String nome = scan.next();
		System.out.print("Insira o numero da conta: ");
		String numConta = scan.next();
		System.out.print("Deseja fazer um deposito inicial? S/N");
		char resp= scan.next().charAt(0);
		
		if(resp=='s') {
			System.out.print("Insira o valor a ser depositado: ");
			double depositoinicial=scan.nextDouble();
			conta= new Conta(nome,numConta,depositoinicial);
		}else {
			conta= new Conta(nome,numConta);
		}
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.print("Informe o valor para deposito: ");
		conta.addSaldo(scan.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.print("Informe o valor para saque: ");
		conta.removSaldo(scan.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		scan.close();
	}
}
