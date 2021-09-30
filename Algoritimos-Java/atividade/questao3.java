package atividade;

public class questao3 {

	public static void main(String[] args) {
		int contador = 0;
		double graos = 1;
		double soma = 0;
		do {
		contador = contador + 1;
		if( contador > 1) 
		graos = graos * 2;
		soma = soma + graos;
		}while(contador <64);
		System.out.println("A quantidade de grãos paga será de: " + soma );
	}

}
