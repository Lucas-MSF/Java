package entidades;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String telefone;
	private Integer fidelidade;
	
	public Cliente(){}	
	
	public Cliente(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.fidelidade=0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getFidelidade() {
		return fidelidade;
	}

	public void addFidelidade() {
		if(fidelidade<10)
			this.fidelidade +=1;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + ", Fidelidade: " + fidelidade;
	}
	
	
}
