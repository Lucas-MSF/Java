package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Quantos funcionarios deseja inserir: ");
		int quantidade = sc.nextInt();
		System.out.println();

		for (int i = 0; i < quantidade; i++) {
			System.out.print("Insira o id do funcionario #"+(i+1)+": ");
			int id = sc.nextInt();
			
			while(verificaId(lista,id)) {
				System.out.println("Funcionario ja existe, tente outro ID:");
				id = sc.nextInt();
			}
			
			System.out.print("Insira o nome do funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Insira o salario do funcionario: ");
			double salario = sc.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
			System.out.println();
		}

		System.out.print("Insira o id do funcionario que deseja alterar o salario: ");
		int id = sc.nextInt();
		System.out.println();
		
		Funcionario func= lista.stream().filter(x-> x.getId()==id).findFirst().orElse(null);
		
		if(func!=null) {
			System.out.print("Insira a porcentagem de aumento: ");
			func.aumentoSalario(sc.nextDouble());
			System.out.println();
		}else
			System.out.println("Não existe funcionario com esse Id.\n");
		
		System.out.println("Funcionarios: ");
		for (Funcionario x : lista)
			System.out.println(x);

		sc.close();
	}
	
	public static boolean verificaId(List<Funcionario> lista, int id ) {
		Funcionario func= lista.stream().filter(x-> x.getId()==id).findFirst().orElse(null);
		return func != null;
	}
}
