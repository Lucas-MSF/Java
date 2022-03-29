package questao_1;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Cliente cliente1= new Cliente();
		Cliente cliente2= new Cliente();
		
		//dados cliente1
		System.out.println("Insira o nome do cliente 1: ");
		cliente1.setNome(sc.next());
		System.out.println("Insira o CPF do cliente 1: ");
		cliente1.setCpf(sc.nextInt());
		System.out.println("Insira o idade do cliente 1: ");
		cliente1.setIdade(sc.nextInt());
		System.out.println("Insira o altura do cliente 1: ");
		cliente1.setAltura(sc.nextFloat());
		System.out.println("Insira o peso do cliente 1: ");
		cliente1.setPeso(sc.nextFloat());
		
		//dados cliente2
		System.out.println("Insira o nome do cliente 2: ");
		cliente2.setNome(sc.next());
		System.out.println("Insira o CPF do cliente 2: ");
		cliente2.setCpf(sc.nextInt());
		System.out.println("Insira o idade do cliente 2: ");
		cliente2.setIdade(sc.nextInt());
		System.out.println("Insira o altura do cliente 2: ");
		cliente2.setAltura(sc.nextFloat());
		System.out.println("Insira o peso do cliente 2: ");
		cliente2.setPeso(sc.nextFloat());
		
		//retornando dados cliente1
		System.out.println("Cliente 1:");
		cliente1.getCliente();
		
		//retornando dados cliente2
		System.out.println("Cliente 2:");
		cliente2.getCliente();
		
		//imc dos clientes
		System.out.println("IMC cliente 1:");
		cliente1.imcCliente();
		System.out.println("IMC cliente 1:");
		cliente2.imcCliente();
	
		sc.close();
	}

}
