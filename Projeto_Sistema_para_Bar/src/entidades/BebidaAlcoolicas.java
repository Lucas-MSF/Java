package entidades;

public class BebidaAlcoolicas extends Bebidas{

	private Double teorAlcolico;

	public BebidaAlcoolicas(Double teorAlcolico, String tipo, Integer litragem, Double valor, Integer codProduto, String nome) {
		super(tipo, litragem, valor, codProduto, nome);
		this.teorAlcolico = teorAlcolico;
	}
	
	public BebidaAlcoolicas(Double teorAlcolico, String tipo, Integer litragem, Double valor, Integer codProduto, String nome, String marca) {
		super(tipo, litragem, valor, codProduto, nome, marca);
		this.teorAlcolico = teorAlcolico;
	}

	public Double getTeorAlcolico() {
		return teorAlcolico;
	}

	public void setTeorAlcolico(Double teorAlcolico) {
		this.teorAlcolico = teorAlcolico;
	}
	
}
