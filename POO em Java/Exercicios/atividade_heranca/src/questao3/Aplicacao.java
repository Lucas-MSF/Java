package questao3;

import java.text.DateFormat;
import java.util.Calendar;

public class Aplicacao {

	public static void main(String[] args) {
		

		Consultor consultor= new Consultor("Marcos","111.111.111-22",'M',"25/5/2005",35.5);
		Comprador comprador= new Comprador("kleber","555.555.555-88",'F',22);
		PerfumeSintetico perfume1= new PerfumeSintetico("CelsoPortiole","celso350","02/01/2020","80%","H2O",100);
		PerfumeNatural perfume2= new PerfumeNatural("Limonada","limao022","21/02/2021","2%","Limao");
		
		Compra compra1= new Compra(perfume1,2,Calendar.getInstance() ,300.50,consultor,comprador);
		Compra compra2= new Compra(perfume2,5,Calendar.getInstance(),725.35,consultor,comprador);
		
		recibo(compra1);
		recibo(compra2);
				
		
	}
	
	public static void recibo(Compra compra) {
		DateFormat formatacao= DateFormat.getInstance();
		System.out.println("------------------ Recibo ------------------");
		System.out.println("Perfume: "+ compra.getPerfume().getNomeFantasia());
		System.out.println("Quantidade: "+ compra.getQuantidade());
		System.out.println("data da compra: "+ formatacao.format(compra.getDataCompra().getTime()));
		System.out.println("Valor: "+ compra.getValorCompra());
		System.out.println("Vendedor: "+ compra.getConsultor().getNome());
		System.out.println("Comprador: "+ compra.getComprador().getNome());
		System.out.println("---------------------------------------------");
	}

}
