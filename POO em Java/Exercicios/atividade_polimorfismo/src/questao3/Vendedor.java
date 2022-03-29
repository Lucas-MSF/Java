package questao3;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public void acrescimoHoraExtra(double horaExtra) {
		setSalario(getSalario() + (horaExtra*1.5));
	}

}