package atividade;

public class questao9 {

	public static void main(String[] args) {
		int aux = 1001;
		int contador = 0;
		int valor = 0;
		
		for(int i = 1000; i < aux ; i++) {
			if(i%11 == 5) {
				contador ++;
				aux+=1;
			}else {
				aux +=1;
			}
			if(contador == 5) {
				valor = i;
				break;
			}
		}
		System.out.println("O numero " + valor + " foi encontrado");
	}
}
