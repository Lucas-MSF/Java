package questao2;

public class Papel {

	private String tipo;
	private String marca;
	private Lapis lapis;
	private Borracha borracha;
	
	public Papel(String tipo, String marca, Lapis lapis, Borracha borracha) {
		this.tipo = tipo;
		this.marca = marca;
		this.lapis = lapis;
		this.borracha = borracha;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void desenhar() {
		System.out.println("pegando lapis da cor "+ lapis.getCor());
		System.out.println("Desenhando boneco... Ops, desenhei errado");
		System.out.println("pegando borracha da marca "+ borracha.getMarca());
		
	}
}
