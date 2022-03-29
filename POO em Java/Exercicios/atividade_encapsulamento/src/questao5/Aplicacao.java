package questao5;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Mochila mochila1= new Mochila();

		System.out.println("Material: ");
		mochila1.setMaterial(sc.next());
		System.out.println("Peso Maximo: ");
		mochila1.setPesoMax(sc.nextFloat());
		System.out.println("Tipo: ");
		mochila1.setTipo(sc.next());
		
		
		System.out.println("Material: "+ mochila1.getMaterial());
		System.out.println("Peso Maximo: "+ mochila1.getPesoMax());
		System.out.println("Tipo: " + mochila1.getTipo());
		
		mochila1.fecharMochila();
		mochila1.abrirMochila();
		mochila1.abrirMochila();
		mochila1.fecharMochila();
		
		sc.close();
		
	}

}
