package atividade;

public class questao9 {

	public static void main(String[] args) {
		
		int x=1001;
		int contador=0;
		
		while(contador <5) {
			if(x%11==5)
				contador++;
			x++;
		}
		System.out.println(x);
	}

}