package questao4;

public class Aplicacao {

	public static void main(String[] args) {
		
		Endereco teste= new Endereco ("ruaboa","bairrobom","60B","GBI","BA");
		Terreno terreno= new Terreno(500, teste,5000,"sim");
		Casa casa= new Casa (700, teste,350000,"sim","nao","sim");
		Apartamento apartamento= new Apartamento (250, teste, 250000,"sim","sim");
		
		System.out.println("terreno");
		System.out.println(terreno.getTerraPlanado());
		System.out.println(terreno.getEndereco().getRua());
		System.out.println(terreno.getValor());
		
		System.out.println("Casa");
		System.out.println(casa.getQuintal());
		System.out.println(casa.getEndereco().getBairro());
		System.out.println(casa.getValor());
		
		System.out.println("Apartamento");
		System.out.println(apartamento.getAreaLazer());
		System.out.println(apartamento.getEndereco().getCidade());
		System.out.println(apartamento.getValor());
		

	}

}
