package questao_5;

import java.util.Scanner;

public class ContaCorrente {

	Scanner sc = new Scanner(System.in);
	private int numeroConta;
	private int numeroAgencia;
	private float saldo = 0;

	public void setConta() {
		System.out.println("Insira o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Insira o numero da agencia: ");
		numeroAgencia = sc.nextInt();
	}

	public void getConta() {
		System.out.println("----------------------------------");
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Numero da agencia: " + numeroAgencia);
		System.out.println("Saldo: " + saldo);
		System.out.println("----------------------------------");
	}

	public void depositar(float valor) {
		saldo += valor;
	}

	public void saque(float valor) {
		if (saldo >= valor)
			saldo -= valor;
		else
			System.out.println("Saldo insuficiente!");
	}

	public float mostraSaldo() {
		return saldo;
	}

}
