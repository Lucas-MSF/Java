package questao_2;


public class Aplicacao {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		
		//dados produto1
		System.out.println("Produto 1:");
		produto1.setProduto();
		
		//dados produto2
		System.out.println("Produto 2:");
		produto2.setProduto();
		
		//Mostrando dados dos produtos
		System.out.println("Produto 1:");
		produto1.getProduto();
		System.out.println("Produto 2:");
		produto2.getProduto();
		
		//verificando quantidade
		System.out.println("Produto 1:");
		produto1.verificaCompra();
		System.out.println("Produto 2:");
		produto2.verificaCompra();
		
	}

}
