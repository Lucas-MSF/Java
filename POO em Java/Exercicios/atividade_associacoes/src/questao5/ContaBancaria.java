package questao5;

public class ContaBancaria {

	private String numeroConta;
	private String agencia;
	private double saldo;
	private Cliente cliente;
	
	public ContaBancaria(String numeroConta, String agencia, double saldo, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}


	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void fazerDeposito(double saldo) {
		this.saldo+= saldo;
		System.out.println("Deposito de "+ saldo + " realizado com sucesso");
	}
	
	public void realizarSaque(double valor) {
		if(saldo>=valor) {
			this.saldo-=valor;
			System.out.println("Saque realizado com sucesso.");
		}else
			System.out.println("Saldo insuficiente");
	}
	
	
}
