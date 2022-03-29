package questao_9;

public class Aplicacao {

	public static void main(String[] args) {
		
		Carro carro1= new Carro();
		Carro carro2= new Carro();

		Motorista motorista1= new Motorista();
		Motorista motorista2= new Motorista();
		
		System.out.println("Carro 1:");
		carro1.setCarro();
		System.out.println("Carro 2:");
		carro2.setCarro();
		
		System.out.println("Motorista 1:");
		motorista1.setMotorista();
		System.out.println("Motorista 2:");
		motorista2.setMotorista();
		
		
	}

}
