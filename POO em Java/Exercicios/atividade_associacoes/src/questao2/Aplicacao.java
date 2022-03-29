package questao2;

public class Aplicacao {

	public static void main(String[] args) {
		
		Papel papel= new Papel("A4","Tilibra", new Lapis("madeira","faber castel","Vermelho"), new Borracha (7.00,"faber castel"));

		papel.desenhar();
	}

}
