package questao3;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public void acrescimoHoraExtra(double horaExtra) {
		setSalario(getSalario() + (horaExtra*2));
	}


}
