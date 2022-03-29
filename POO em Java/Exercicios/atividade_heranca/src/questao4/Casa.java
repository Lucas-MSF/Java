package questao4;

public class Casa extends Imovel {

	private String quintal;
	private String pscina;
	private String garagem;
	
	public Casa(double metrosQuadrado, Endereco endereco, double valor, String quintal, String pscina, String garagem) {
		super(metrosQuadrado, endereco, valor);
		this.quintal = quintal;
		this.pscina = pscina;
		this.garagem = garagem;
	}

	public String getQuintal() {
		return quintal;
	}

	public void setQuintal(String quintal) {
		this.quintal = quintal;
	}

	public String getPscina() {
		return pscina;
	}

	public void setPscina(String pscina) {
		this.pscina = pscina;
	}

	public String getGaragem() {
		return garagem;
	}

	public void setGaragem(String garagem) {
		this.garagem = garagem;
	}
	
}
