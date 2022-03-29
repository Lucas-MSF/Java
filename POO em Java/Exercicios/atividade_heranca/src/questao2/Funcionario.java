package questao2;

public class Funcionario extends Pessoa{
	private double salario;
	private int idFuncionario;
	
	
	public Funcionario(String nome, String cpf, char sexo, String dataNascimento, double salario, int idFuncionario) {
		super(nome, cpf, sexo, dataNascimento);
		this.salario = salario;
		this.idFuncionario = idFuncionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

}
