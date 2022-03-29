package questao2;

public class TestaCarro {

	public static void main(String[] args) {
	
	//Condutor meuCondutor = new Condutor("555-Y", "Joao Pedro", 'M', 65);
	Motor motor = new Motor("Ford", 2.0, "Gasolina");
	//Carro meuCarro = new Carro ("Fusca Verde", 120, motor, 10000);
	
	//System.out.println(meuCarro.getValorVenda());

	Carro carro = new Taxi("Fiat", 100, motor, 10000, "123-X", 120);
	
	System.out.println(((Taxi)carro).getValorVenda());
	
	}
}
