package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.Produto;
import entidades_enum.OrderStatus;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome= sc.nextLine();
		System.out.print("Email: ");
		String email= sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento= sdf.parse(sc.next());
		
		Cliente cliente= new Cliente(nome, email, dataNascimento);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status= sc.next();
		
		
		Date dataSistema= new Date();
		
		Ordem pedido= new Ordem(dataSistema,OrderStatus.valueOf(status),cliente);
		
		System.out.print("Quantos itens deve haver no pedido?");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Entre com os dados do produto #"+(i+1)+":");
			System.out.print("Insira o nome do produto: ");
			sc.nextLine();
			String produtoNome= sc.nextLine();
			System.out.print("Insira o preco do produto: ");
			Double preco=sc.nextDouble();
			Produto produto= new Produto(produtoNome, preco);
			System.out.print("Insira a quantidade de itens desejada: ");
			Integer quantidade= sc.nextInt();
			OrdemItem pedidoItem= new OrdemItem(quantidade, produto);
			pedido.addItem(pedidoItem);
		}
		
		System.out.println(pedido);
		sc.close();
	}

}
