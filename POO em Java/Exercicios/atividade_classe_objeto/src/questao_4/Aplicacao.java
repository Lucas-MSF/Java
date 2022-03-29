package questao_4;

public class Aplicacao {

	public static void main(String[] args) {
	
		Aluno aluno1= new Aluno();
		Aluno aluno2= new Aluno();
	
		//inserindo dados
		System.out.println("Aluno 1:");
		aluno1.setAluno();
		System.out.println("Aluno 2:");
		aluno2.setAluno();
		
		//mostrando dados
		System.out.println("Aluno 1:");
		aluno1.getAluno();
		System.out.println("Aluno 2:");
		aluno2.getAluno();
		
		//mostrando media
		System.out.println("Aluno 1:");
		aluno1.mediaAluno();
		System.out.println("Aluno 2:");
		aluno2.mediaAluno();
		
	}

}
