package questao3;

public class Perfume {

	private String nomeFantasia;
	private String nomeTecnico;
	private String dataCriacao;
	private String retencaoPele;
	
	
	public Perfume(String nomeFantasia, String nomeTecnico, String dataCriacao, String retencaoPele) {
		this.nomeFantasia = nomeFantasia;
		this.nomeTecnico = nomeTecnico;
		this.dataCriacao = dataCriacao;
		this.retencaoPele = retencaoPele;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getNomeTecnico() {
		return nomeTecnico;
	}
	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getRetencaoPele() {
		return retencaoPele;
	}
	public void setRetencaoPele(String retencaoPele) {
		this.retencaoPele = retencaoPele;
	}
	
}
