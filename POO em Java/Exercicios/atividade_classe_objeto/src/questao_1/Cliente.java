package questao_1;

public class Cliente {

	private int cpf;
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public void setCpf (int cpf) {
		this.cpf = cpf;
	}
	public void setNome (String nome) {
		this.nome= nome;
	}
	public void setIdade (int idade) {
		this.idade= idade;
	}
	public void setPeso (float peso) {
		this.peso= peso;
	}
	public void setAltura (float altura) {
		this.altura=altura;
	}
	
	public void getCliente() {
		System.out.println("-----------------------------");
		System.out.println("nome: "+ nome);
		System.out.println("cpf: "+ cpf);
		System.out.println("idade: "+idade);
		System.out.println("altura: "+altura);
		System.out.println("peso: "+peso);
		System.out.println("-----------------------------");
	}
	
	public float imcCliente() {
		return peso/(altura * altura );
	}
	
}


