package questao5;

public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria contaBancaria;
		Endereco enderecoPedro= new Endereco("Rua 4", 250,"Centro","Guanambi","464300-00","Bahia","Brasil");
		Cliente cliente= new Cliente("Pedro","111222333-44",enderecoPedro);
		contaBancaria= new ContaBancaria("11111-11","9999",0,cliente);
	
		
		System.out.println("dono da conta: " + contaBancaria.getCliente().getNome());
		System.out.println("Rua, numero e bairro do cliente: " + contaBancaria.getCliente().getEndereco().getRua() + "-" + contaBancaria.getCliente().getEndereco().getNumero()+ "-"+ contaBancaria.getCliente().getEndereco().getBairro());
		System.out.println("saldo da conta:" + contaBancaria.getSaldo());
		
		System.out.print("Realizar saque no valor de 10 reais: ");
		contaBancaria.realizarSaque(10);
		contaBancaria.fazerDeposito(15);
		System.out.println("saldo da conta:" + contaBancaria.getSaldo());
		
	}

}
