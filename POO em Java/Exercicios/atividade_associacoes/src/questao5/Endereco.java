package questao5;

public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String ceep;
	private String estado;
	private String pais;
	
	public Endereco(String rua, int numero, String bairro, String cidade, String ceep, String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.ceep = ceep;
		this.estado = estado;
		this.pais = pais;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCeep() {
		return ceep;
	}

	public void setCeep(String ceep) {
		this.ceep = ceep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
