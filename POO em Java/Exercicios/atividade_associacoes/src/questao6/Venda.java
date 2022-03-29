package questao6;

public class Venda {

	private Produto produto;
	private int quantidade;
	private Funcionario funcionario;
	
	public Venda(Produto produto, int quantidade, Funcionario funcionario) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.funcionario = funcionario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void realizarVenda(Produto produto, int quantidade) {
		this.produto.setQuantidade( produto.getQuantidade()-quantidade);
		this.funcionario.setSalario((produto.getPreco()*(double)quantidade)*0.1);
		System.out.println("Venda realizada no valor de "+ produto.getPreco()*quantidade);
	}
	
}
