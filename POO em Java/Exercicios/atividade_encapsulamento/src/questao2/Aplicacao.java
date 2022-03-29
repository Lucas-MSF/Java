package questao2;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Carro carro1= new Carro();
		
		System.out.println("Marca: ");
		carro1.setMarca(sc.next());
		System.out.println("Modelo: ");
		carro1.setModelo(sc.next());
		System.out.println("Cor: ");
		carro1.setCor(sc.next());
		System.out.println("Placa: ");
		carro1.setPlaca(sc.next());
		
		System.out.println("Marca: "+ carro1.getMarca());
		System.out.println("Modelo: "+ carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Placa: "+ carro1.getPlaca());
		
		carro1.desligarCarro();
		carro1.ligarSom();
		carro1.ligarCarro();
		carro1.ligarSom();
		carro1.ligarCarro();
		carro1.desligarCarro();
		
		sc.close();
		
		
	}

}
