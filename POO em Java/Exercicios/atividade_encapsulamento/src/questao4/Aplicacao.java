package questao4;

import questao3.Equacao;

public class Aplicacao {

	public static void main(String[] args) {
		
		Equacao equacao=new Equacao();

		equacao.setA(1);
		equacao.setB(-3);
		equacao.setC(2);
		
		equacao.setDelta();
		equacao.setX1();
		equacao.setX2();
		
		System.out.println("Valor de delta: "+ equacao.getDelta());
		System.out.println("Valor de x1: "+ equacao.getX1());
		System.out.println("Valor de x2: "+ equacao.getX2());
		
	}

}
