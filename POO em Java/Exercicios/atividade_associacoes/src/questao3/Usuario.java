package questao3;

public class Usuario {
	
	private String cpf;
	private String nome;
	private String dataDeNascimento;
	private Perifericos perifericos;
	
	public Usuario(String cpf, String nome, String dataDeNascimento, Perifericos perifericos) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.perifericos = perifericos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Perifericos getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(Perifericos perifericos) {
		this.perifericos = perifericos;
	}
	
}
