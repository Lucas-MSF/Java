package questao3;

public class Aplicacao {

	public static void main(String[] args) {
		
		Computador computador;
		Perifericos perifericos= new Perifericos(new Mouse("Fortrek","M7",7200), new Teclado("Mecanico", "Fortrek", "k7 rainbow"), new HeadSet("fortrek","Cruiser","Preto"));
		Usuario usuario;
		
		usuario= new Usuario("123456789-11","Marcos","11/11/2011",perifericos);
		computador= new Computador("Inte Core i5",16,"gtx 1050 ti",usuario);
		
		System.out.println("Processador: "+ computador.getProcessador());
		System.out.println("Memoria RAM (GB): "+ computador.getMemoriaRam());
		System.out.println("Placa de video: "+ computador.getPlacaDeVideo());
		System.out.println("Quem esta usando esse computador eh: "+ computador.getUsuario().getNome());
		
		System.out.println("Marca e Modelo do mouse: "+ usuario.getPerifericos().getMouse().getMarca() + " " + usuario.getPerifericos().getMouse().getModelo());
		System.out.println("Marca e Modelo do teclado: "+ usuario.getPerifericos().getTeclado().getMarca() +  " " + usuario.getPerifericos().getTeclado().getModelo());
		System.out.println("Marca e Modelo do HeadSet: "+ usuario.getPerifericos().getHeadSet().getMarca() +  " " + usuario.getPerifericos().getHeadSet().getModelo());
	}

}
