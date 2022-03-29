package questao3;

public class Perifericos {
	
	private Mouse mouse;
	private Teclado teclado;
	private HeadSet headSet;
	
	public Perifericos(Mouse mouse, Teclado teclado, HeadSet headSet) {
		this.mouse = mouse;
		this.teclado = teclado;
		this.headSet = headSet;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public HeadSet getHeadSet() {
		return headSet;
	}
	public void setHeadSet(HeadSet headSet) {
		this.headSet = headSet;
	}

}
