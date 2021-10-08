package entidades;

public class Alunos {
	public String nome;
	public float nota1,nota2,nota3;
	
	public double media() {
		return nota1+nota2+nota3;
	}
	public void verificaSePassou() {
		if(media()>60)
			System.out.println("Passou!");
		else
			System.out.printf("Perdeu \nPerdeu por: %.2f pontos", 60-media());
	}
}
