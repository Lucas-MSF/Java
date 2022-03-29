package questao6;

public class Aplicacao {

	public static void main(String[] args) {
		Funcionario funcionario= new Funcionario("Lucas","111222333-44",0);
		Produto produto= new Produto("Kuat", "Coca-cola", "Refrigerante",5.50,30);
		Venda venda= new Venda(produto,5,funcionario);
		
		System.out.println(funcionario.getSalario());
		System.out.println(produto.getQuantidade());
		venda.realizarVenda(produto, 3);
		System.out.printf("%.2f\n",funcionario.getSalario());
		System.out.println(produto.getQuantidade());
	}

}
