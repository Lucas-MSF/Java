package entidades;

public class Funcionario {

	private String nome;
	private String cpf;
	private String telefone;
	private Double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, String cpf, String telefone, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void acrescimoSalario(double acrescimo) {
		this.salario+=acrescimo;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + ", CPF:" + cpf + ", Telefone: " + telefone + ", Salario: "+ String.format("%.2f", salario);
	}
	
	
}
