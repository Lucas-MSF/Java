package questao_5;

public class Aplicacao {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();

		// criando conta
		System.out.println("Conta 1: ");
		conta1.setConta();
		System.out.println("Conta 2: ");
		conta2.setConta();

		// mostrando dados da conta
		System.out.println("Conta 1: ");
		conta1.getConta();
		System.out.println("Conta 2: ");
		conta2.getConta();

		// deposito
		System.out.println("Conta 1: ");
		System.out.println("realizando deposito de 500 reais...");
		conta1.depositar(500);
		System.out.println("Conta 2: ");
		System.out.println("realizando deposito de 450 reais...");
		conta2.depositar(450);

		// saque
		System.out.println("Conta 1: ");
		System.out.println("realizando saque de 250 reais...");
		conta1.saque(250);
		System.out.println("Conta 2: ");
		System.out.println("realizando saque de 455 reais...");
		conta2.saque(455);

		// saldo
		System.out.println("Conta 1: ");
		System.out.println("Saldo: " + conta1.mostraSaldo());
		System.out.println("Conta 2: ");
		System.out.println("Saldo: " + conta2.mostraSaldo());
	}

}
