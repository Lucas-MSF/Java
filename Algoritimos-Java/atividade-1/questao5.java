package atividade;
import java.util.Random;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner ent= new Scanner(System.in);
		Random gerador= new Random();
		int NumeroTime=0;
		
		String[]  times= {"Flamengo","CNB","PaiN","Furia","INTZ","ProGaming",
		"Keyd","REDCannadis","TeamOne","SKT T1"};
		
		String[] frases= {"venceu o ultimo jogo","perdeu o ultimo jogo","empatou o ultimo jogo"
		,"é o melhor time do cenario atual","é o pior time do cenario atual","é o time com maior torcida",
		"é o time com a menor torcida"};
		
		System.out.println("Escolha o numero que representa seu time: ");
		
		for(int i=0; i<10;i++) {
			System.out.println(i+". "+times[i]);		
		}
		
		NumeroTime= ent.nextInt();
		
		int NumeroFrase= gerador.nextInt(7);
		
		switch(NumeroTime) {
		
			case 0:
				System.out.println(times[0]+" "+frases[NumeroFrase]);
				break;
			case 1:
				System.out.println(times[1]+" "+frases[NumeroFrase]);
				break;
			case 2:
				System.out.println(times[2]+" "+frases[NumeroFrase]);
				break;
			case 3:
				System.out.println(times[3]+" "+frases[NumeroFrase]);
				break;
			case 4:
				System.out.println(times[4]+" "+frases[NumeroFrase]);
				break;
			case 5:
				System.out.println(times[5]+" "+frases[NumeroFrase]);
				break;
			case 6:
				System.out.println(times[6]+" "+frases[NumeroFrase]);
				break;
			case 7:
				System.out.println(times[7]+" "+frases[NumeroFrase]);
				break;
			case 8:
				System.out.println(times[8]+" "+frases[NumeroFrase]);
				break;
			case 9:
				System.out.println(times[9]+" "+frases[NumeroFrase]);
				break;
				
		}
	}
}
