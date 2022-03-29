package entidades;

public class OrdemItem {

	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	public OrdemItem() {
		
	}

	public OrdemItem(Integer quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto=produto;
		this.preco= produto.getPreco();
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		Double subtotal= preco*quantidade;
		return subtotal;
	}

	@Override
	public String toString() {
		return "Pedido: " + produto + ", quantidade: " + quantidade+", subtoal: " +String.format("%.2f",subTotal()) ;
	}
	
	
}
