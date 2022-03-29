package questao3;

public class Aplicacao {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente("Ronaldo", "111.111.111-11", 2.500);

		if (funcionario instanceof Gerente)
			System.out.println("é gerente");
		else if(funcionario instanceof Vendedor)
			System.out.println("é vendedor");
	}
}
