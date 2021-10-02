package atividade;

public class questao3 {

	public static void main(String[] args) {
	double graos=1, soma=1;
	
		
		for(int i=1;i<64;i++) {
			graos*=2;
			soma+=graos;
		}
		System.out.print("Soma dos graos: "+soma);
	}

}
