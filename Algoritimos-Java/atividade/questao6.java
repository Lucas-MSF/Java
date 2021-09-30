package atividade;

public class questao6 {
	public static void main(String[] args) {
	
		
		int[] vetor1= {1,2,3,4,5,6,7,8,9,10};
		int[] vetor2= {11,12,13,14,15,16,17,18,19,20};
		int[] vetor3= new int[10];
		
		for(int i=0;i<10;i++) {
		vetor3[i]=vetor1[i]*vetor2[i];
		}
		for(int i=0;i<10;i++) {
			System.out.println(vetor3[i]);
		}
	}
}
