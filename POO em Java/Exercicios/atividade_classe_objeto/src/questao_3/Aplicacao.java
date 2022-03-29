package questao_3;

public class Aplicacao {

	public static void main(String[] args) {
			
		Funcionario funcionario1= new Funcionario();
		Funcionario funcionario2= new Funcionario();
		
		//dados funcionario1
		System.out.println("Funcionario 1:");
		funcionario1.setFuncionario();
				
		//dados funcionario2
		System.out.println("Funcionario 2:");
		funcionario2.setFuncionario();
				
		//Mostrando dados dos funcionarios
		System.out.println("funcionario 1:");
		funcionario1.getFuncionario();
		System.out.println("funcionario 2:");
		funcionario2.getFuncionario();
				
		//verificando cargo
		System.out.println("funcionario 1:");
		funcionario1.verificaCargo();
		System.out.println("funcionario 2:");
		funcionario2.verificaCargo();

	}

}
