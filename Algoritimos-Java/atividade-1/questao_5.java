package atividade;
import java.util.Random;
import java.util.Scanner;

public class questao5 {
	public static void main(String[]args){
	
		Random rs= new Random();
		Scanner sc= new Scanner(System.in);
		
		int opcao;
		
		String[]  times= {"Flamengo","CNB","PaiN","Furia","INTZ","ProGaming",
							"Keyd","REDCannadis","TeamOne","SKT T1"};
			
		String[] frases= {"venceu o ultimo jogo","perdeu o ultimo jogo","empatou o ultimo jogo"
						,"é o melhor time do cenario atual","é o pior time do cenario atual","é o time com maior torcida",
						"é o time com a menor torcida"};
		
		System.out.println("Escolha o time:");
			for(int i=0; i<10;i++)
				System.out.println(i+"." + times[i]);
			System.out.print(">> ");
			opcao= sc.nextInt();
			
		if(opcao >=0 && opcao<=9)	
		System.out.println(times[opcao] + " " + frases[rs.nextInt(7)]);
		else
			System.out.println("opcao invalida!");
	
		sc.close();
	}
}