package questao2;

public class Aplicacao {

	public static void main(String[] args) {
		
		
		Gerente gerente1= new Gerente("lucas","111.111.111-11",'M',"11/11/11",1550.50,3,"admin0000");

		System.out.println("nome: "+ gerente1.getNome());
		System.out.println("data de nascimento: "+ gerente1.getDataNascimento());
		System.out.println("idFuncionario: "+ gerente1.getIdFuncionario());
		System.out.println("senha: "+ gerente1.getSenha());
	}

}
