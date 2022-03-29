package questao2;

public class Gerente extends Funcionario {
	
	private String senha;

	public Gerente(String nome, String cpf, char sexo, String dataNascimento, double salario, int idFuncionario,
			String senha) {
		super(nome, cpf, sexo, dataNascimento, salario, idFuncionario);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
