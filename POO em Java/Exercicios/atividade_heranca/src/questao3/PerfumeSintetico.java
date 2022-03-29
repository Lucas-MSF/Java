package questao3;

public class PerfumeSintetico extends Perfume {
	
	private String formulaDosProdutos;
	private double fatorRisco;
	
	
	public PerfumeSintetico(String nomeFantasia, String nomeTecnico, String dataCriacao, String retencaoPele,
			String formulaDosProdutos, double fatorRisco) {
		super(nomeFantasia, nomeTecnico, dataCriacao, retencaoPele);
		this.formulaDosProdutos = formulaDosProdutos;
		this.fatorRisco = fatorRisco;
	}
	
	public String getFormulaDosProdutos() {
		return formulaDosProdutos;
	}
	public void setFormulaDosProdutos(String formulaDosProdutos) {
		this.formulaDosProdutos = formulaDosProdutos;
	}
	public double getFatorRisco() {
		return fatorRisco;
	}
	public void setFatorRisco(double fatorRisco) {
		this.fatorRisco = fatorRisco;
	}
	
	
}
