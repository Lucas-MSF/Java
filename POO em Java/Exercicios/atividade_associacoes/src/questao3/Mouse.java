package questao3;

public class Mouse {
	
	private String marca;
	private String modelo;
	private int dpi;
	
	
	public Mouse(String marca, String modelo, int dpi) {
		this.marca = marca;
		this.modelo = modelo;
		this.dpi = dpi;
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getDpi() {
		return dpi;
	}


	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	
	
}
