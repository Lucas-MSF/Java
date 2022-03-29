package questao4;

public class Apartamento extends Imovel {
	
	private String garagem;
	private String areaLazer;
	
	public Apartamento(double metrosQuadrado, Endereco endereco, double valor, String garagem, String areaLazer) {
		super(metrosQuadrado, endereco, valor);
		this.garagem = garagem;
		this.areaLazer = areaLazer;
	}
	public String getGaragem() {
		return garagem;
	}
	public void setGaragem(String garagem) {
		this.garagem = garagem;
	}
	public String getAreaLazer() {
		return areaLazer;
	}
	public void setAreaLazer(String areaLazer) {
		this.areaLazer = areaLazer;
	}
	
	

}
