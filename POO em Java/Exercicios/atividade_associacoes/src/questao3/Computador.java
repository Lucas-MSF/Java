package questao3;

public class Computador {

	private String processador;
	private int memoriaRam;
	private String placaDeVideo;
	private Usuario usuario;
	
	
	public Computador(String processador, int memoriaRam, String placaDeVideo, Usuario usuario) {
		this.processador = processador;
		this.memoriaRam = memoriaRam;
		this.placaDeVideo = placaDeVideo;
		this.usuario=usuario;
	}

	public String getProcessador() {
		return processador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	
	
	
}
