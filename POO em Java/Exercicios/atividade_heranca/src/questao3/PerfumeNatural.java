package questao3;

public class PerfumeNatural extends Perfume{
	
	private String insumoNatural;

	public PerfumeNatural(String nomeFantasia, String nomeTecnico, String dataCriacao, String retencaoPele,
			String insumoNatural) {
		super(nomeFantasia, nomeTecnico, dataCriacao, retencaoPele);
		this.insumoNatural = insumoNatural;
	}

	public String getInsumoNatural() {
		return insumoNatural;
	}

	public void setInsumoNatural(String insumoNatural) {
		this.insumoNatural = insumoNatural;
	}
	

}
