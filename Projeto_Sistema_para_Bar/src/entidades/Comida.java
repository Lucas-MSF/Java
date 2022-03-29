package entidades;

public class Comida {
	
	private Integer codProduto;
	private String tipo;
	private Integer qntPessoasServem;
	private Double valor;
	private String nome;
	
	public Comida() {}

	public Comida(Integer codProduto, String tipo, Integer qntPessoasServem, Double valor, String nome) {
		
		this.codProduto = codProduto;
		this.tipo = tipo;
		this.qntPessoasServem = qntPessoasServem;
		this.valor= valor;
		this.nome = nome;
	}

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getQntPessoasServem() {
		return qntPessoasServem;
	}

	public void setQntPessoasServem(Integer qntPessoasServem) {
		this.qntPessoasServem = qntPessoasServem;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	@Override
	public String toString() {
		StringBuilder comida= new StringBuilder();
		comida.append("Nome: "+nome+" ");
		comida.append("Tipo:" +tipo+ " ");
		comida.append("Quantas pessoas servem: "+qntPessoasServem+" ");
		comida.append("Valor: "+String.format("%.2f", valor)+" ");
		return comida.toString();
	}
	
}
