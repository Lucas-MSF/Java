package questao2;

public class Lapis {
	
	private String material;
	private String marca;
	private String cor;
	
	
	public Lapis(String material, String marca, String cor) {
		this.material = material;
		this.marca = marca;
		this.cor = cor;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
