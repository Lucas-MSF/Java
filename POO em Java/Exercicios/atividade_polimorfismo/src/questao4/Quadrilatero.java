package questao4;

public class Quadrilatero extends Poligono {

	public Quadrilatero(int lados, int vertices) {
		super(lados, vertices);
	}
	
	public void area() {
		setArea(getLados()*getLados());
	}

	
}
