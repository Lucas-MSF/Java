package questao_2;

import java.util.Scanner;

public class Produto {
	Scanner sc= new Scanner(System.in);
	private String tipo;
	private String marca;
	private int quantidade;
	private float preco;
	private String validade;
	
	public void setProduto() {
		System.out.println("Insira o tipo do produto: ");
		tipo= sc.next();
		System.out.println("Insira o marca do produto 1: ");
		marca= sc.next();
		System.out.println("Insira o quantidade do produto 1: ");
		quantidade = sc.nextInt();
		System.out.println("Insira o preco do produto 1: ");
		preco= sc.nextFloat();
		System.out.println("Insira o validade do produto 1: ");
		validade = sc.next();
	}	
	public void getProduto () {
		System.out.println("-----------------------------");
		System.out.println("tipo: "+ tipo);
		System.out.println("marca: "+ marca);
		System.out.println("quantidade: "+ quantidade);
		System.out.println("preco: "+preco);
		System.out.println("validade: "+validade);
		System.out.println("-----------------------------");
	}
	public void verificaCompra() {
		if(quantidade>10)
			System.out.println("Nao ah necessidade de comprar mais "+ tipo+ "da marca"+ marca);
		else
			System.out.println("Eh necessario comprar mais "+ tipo+ "da marca"+ marca);
	}
	
	
}
