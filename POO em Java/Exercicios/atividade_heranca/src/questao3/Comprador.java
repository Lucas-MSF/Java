package questao3;

public class Comprador extends Pessoa {

	private int pontos;

	public Comprador(String nome, String cpf, char sexo, int pontos) {
	super(nome, cpf, sexo);
	this.pontos = pontos;
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
}
