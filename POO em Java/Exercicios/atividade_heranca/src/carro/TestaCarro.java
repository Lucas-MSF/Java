package carro;

public class TestaCarro {

	public static void main(String[] args) {
	
	Condutor meuCondutor = new Condutor("555-Y", "Lucas Santiago", 'M', 65);
	Motor motor = new Motor("Ford", 2.0, "Gasolina");
	Carro meuCarro = new Carro ("Fusca Azul", 120, motor);
	
	System.out.println("Nome: "+ meuCondutor.getNome());
	System.out.println("Código da Habilitação: "+ meuCondutor.getCodHabilitacao());
	

	}
}
