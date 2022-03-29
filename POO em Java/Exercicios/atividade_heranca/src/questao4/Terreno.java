package questao4;

public class Terreno extends Imovel {

	private String terraPlanado;


	public Terreno(double metrosQuadrado, Endereco endereco, double valor, String terraPlanado) {
		super(metrosQuadrado, endereco, valor);
		this.terraPlanado = terraPlanado;
	}

	public String getTerraPlanado() {
		return terraPlanado;
	}

	public void setTerraPlanado(String terraPlanado) {
		this.terraPlanado = terraPlanado;
	}
	
}
