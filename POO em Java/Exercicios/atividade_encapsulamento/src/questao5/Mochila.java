package questao5;

public class Mochila {
	
		private String material;
		private float pesoMax;
		private String tipo;
		private boolean aberta= false;
		
		public void setMaterial (String material) {
			this.material=material;
		}
		public void setPesoMax (float peso) {
			this.pesoMax=peso;
		}
		public void setTipo (String tipo) {
			this.tipo=tipo;
		}
		public String getMaterial() {
			return this.material;
		}
		public float getPesoMax() {
			return this.pesoMax;
		}
		public String getTipo() {
			return this.tipo;
		}
		
		private boolean isOpen() {
			return this.aberta;
		}
		
		public void abrirMochila() {
			if(isOpen()==false) {
				System.out.println("Abrindo Mochila...");
				this.aberta=true;
			}else
				System.out.println("A mochila ja esta aberta...");
		}
		public void fecharMochila() {
			if(isOpen()) {
				System.out.println("Fechando mochila...");
				this.aberta=false;
			}else
				System.out.println("A mochila ja esta fechada...");
		}
		
}
