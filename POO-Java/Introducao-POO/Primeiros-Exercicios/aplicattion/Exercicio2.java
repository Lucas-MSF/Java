package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario x= new Funcionario();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Nome: ");
		x.nome= sc.nextLine();
		System.out.print("Salario: ");
		x.salario= sc.nextFloat();
		System.out.print("Taxa: ");
		x.taxa= sc.nextFloat();
		
		System.out.println("Funcionario: "+x.nome+" $ "+x.salarioLiquido());
		System.out.print("Quantos % vc deseja adcionar ao salario: ");
		double porcentagem= sc.nextFloat();
		
		x.salarioAdcional(porcentagem);
		
		sc.close();
	}

}
