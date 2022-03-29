package entidades;

public class Bebidas {

	private String tipo;
	private Integer litragem;
	private Double valor;
	private Integer codProduto;
	private String nome;
	private String marca;

	public Bebidas() {
	}

	public Bebidas(String tipo, Integer litragem, Double valor, Integer codProduto, String nome, String marca) {
		this.tipo = tipo;
		this.litragem = litragem;
		this.valor = valor;
		this.codProduto = codProduto;
		this.nome = nome;
		this.marca = marca;
	}

	public Bebidas(String tipo, Integer litragem, Double valor, Integer codProduto, String nome) {
		this.tipo = tipo;
		this.litragem = litragem;
		this.valor = valor;
		this.codProduto = codProduto;
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getLitragem() {
		return litragem;
	}

	public void setLitragem(Integer litragem) {
		this.litragem = litragem;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +", tipo: "+ tipo +", litragem: " + litragem + ", valor: " + String.format("%.2f", valor) ;
	}

}
