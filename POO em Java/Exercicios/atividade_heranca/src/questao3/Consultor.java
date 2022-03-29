package questao3;

public class Consultor extends Pessoa {

	private String dataAfiliacao;
	private double porcentagemDesconto;
	
	public Consultor(String nome, String cpf, char sexo, String dataAfiliacao, double porcentagemDesconto) {
		super(nome, cpf, sexo);
		this.dataAfiliacao = dataAfiliacao;
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public String getDataAfiliacao() {
		return dataAfiliacao;
	}

	public void setDataAfiliacao(String dataAfiliacao) {
		this.dataAfiliacao = dataAfiliacao;
	}

	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}
	
	
	
	
}
