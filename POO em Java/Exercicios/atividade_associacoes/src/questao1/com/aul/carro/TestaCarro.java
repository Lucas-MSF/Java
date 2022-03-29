package questao1.com.aul.carro;

public class TestaCarro {

	public static void main(String[] args) {
		Condutor meuCondutor;
		Carro meuCarro;
		
		meuCondutor = new Condutor("123456-7 ");
		meuCarro = new Carro("Kombi", new Motor("Ford", 2.0, "Gasolina"));
		
		meuCondutor.dirigir(meuCarro);
	}

}
