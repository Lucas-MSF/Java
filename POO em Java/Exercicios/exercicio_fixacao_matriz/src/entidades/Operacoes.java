package entidades;

public class Operacoes {
	
	public static void verifica(int matriz[][],int num) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;i<matriz[i].length;i++) {
			
				if(num==matriz[i][j]) {
					System.out.println("Numero: "+num + ", posicao: ("+i+","+j+").");
					if(matriz[(i-1)][j]>0) {
						System.out.println("Cima: " + matriz[(i-1)][j]);
					}
					if(matriz[(i+1)][j]>0) {
						System.out.println("Baixo: " + matriz[(i+1)][j]);
					}
					if(matriz[i][(j-1)]>0) {
						System.out.println("Esquerda: "+ matriz[i][(j-1)]);
					}
					if(matriz[i][(j+1)]>0) {
						System.out.println("Direita: "+ matriz[i][(j+1)]);
					}
				}
			}
		}
		
		
	}

}
