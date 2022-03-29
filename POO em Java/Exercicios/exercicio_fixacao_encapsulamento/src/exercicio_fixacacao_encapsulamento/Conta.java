package exercicio_fixacacao_encapsulamento;

public class Conta {
	private String nome;
	private String numConta;
	private double saldo;
	
	public Conta(String nome, String numConta, double saldo) {
		this.nome = nome;
		this.numConta = numConta;
		addSaldo(saldo);
	}

	public Conta(String nome, String numConta) {
		this.nome = nome;
		this.numConta = numConta;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void addSaldo(double deposito) {
		this.saldo+=deposito;
	}
	public void removSaldo(double saque) {
		this.saldo-=saque + 5;
		
	}


	public String toString() {
		return "nome: " + nome + ", conta: " + numConta + ", saldo: " + String.format("%.2f", saldo);
	}

	
}
