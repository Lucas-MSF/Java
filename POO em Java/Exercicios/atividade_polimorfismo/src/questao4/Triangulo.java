package questao4;

public class Triangulo extends Poligono{

	private int base;
	private int altura;
	
	public Triangulo(int lados, int vertices,int base, int altura) {
		super(lados, vertices);
		this.base=base;
		this.altura=altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void area() {
		setArea((base*altura)/2);
	}
	
	

}
