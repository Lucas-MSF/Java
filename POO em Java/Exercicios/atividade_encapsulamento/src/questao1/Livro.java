package questao1;

public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private int paginas;
	private float valor;
	
	public void setTitulo (String titulo) {
		this.titulo=titulo;
	}
	public void setAutor (String autor) {
		this.autor=autor;
	}
	public void setEditora (String editora) {
		this.editora=editora;
	}
	public void setPaginas (int paginas) {
		this.paginas=paginas;
	}
	public void setValor (float valor) {
		this.valor=valor;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public String getEditora() {
		return this.editora;
	}
	public int getPaginas() {
		return this.paginas;
	}
	public float getValor() {
		return this.valor;
	}
}
