package questao1.com.aul.carro;

public class Condutor {
	private String codHabilitacao;
	
	public Condutor(String codHabilitacao) {
		this.codHabilitacao = codHabilitacao;
	}
	
	public String getCodHabilitacao() {
		return codHabilitacao;
	}
	
	public void setCodHabilitacao(String codHabilitacao) {
		this.codHabilitacao = codHabilitacao;
	}
	
	public void dirigir(Carro carro) {
		System.out.println("Condutor " +getCodHabilitacao()+ "dirigir");
		System.out.println("É um modelo " +carro.getModelo());
		System.out.println("Motor: "+carro.getMotor().getCilindrada());
	}
	
}
