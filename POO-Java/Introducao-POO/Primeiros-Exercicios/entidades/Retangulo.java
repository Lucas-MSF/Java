package entidades;

public class Retangulo {

	public double altura;
	public double largura;

	public double area() {
		return altura*largura;
	}

	public double perimetro() {
		return 2 * (largura + altura);
	}

	public double diagonal() {
		
		return Math.sqrt((largura * largura)+(altura * altura));
	}

}
