package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Retangulo x= new Retangulo();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Insira a altura e a largura do retangulo: ");
		x.altura= sc.nextDouble();
		x.largura=sc.nextDouble();
		
		System.out.printf("area: %.2f \n",x.area());
		System.out.printf("perimetro: %.2f \n",x.perimetro());
		System.out.printf("diagonal: %.2f \n ",x.diagonal());
		
		sc.close();
	}

}
