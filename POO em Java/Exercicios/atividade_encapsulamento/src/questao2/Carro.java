package questao2;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	private boolean ligado=false;
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getCor() {
		return this.cor;
	}
	public String getPlaca() {
		return this.placa;
	}
	
	private boolean isLigado () {
		return this.ligado;
	}
	
	public void ligarCarro() {
		if(isLigado()==false) {
			System.out.println("Ligando carro... VRUM VRUM");
			ligado=true;
		}else
			System.out.println("O carro ja esta ligado... VRUM VRUM");
	}
	public void desligarCarro() {
		if(isLigado()) {
			System.out.println("Desligando carro...");
			ligado=false;
		}else
			System.out.println("O carro ja esta desligado...");
	}
	public void ligarSom() {
		if(isLigado())
			System.out.println("Ligando som... Never gonna give you up Never gonna let you down");
		else
			System.out.println("E necessario ligar o carro antes...");
	}
	
}
