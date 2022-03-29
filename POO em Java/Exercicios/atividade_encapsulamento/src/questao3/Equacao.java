package questao3;

public class Equacao {
	
	private int a,b,c;
	private int delta;
	private int x1,x2;
	
	public void setA(int a) {
		if(a==0)
			a=1;
		
		this.a=a;
	}
	
	public void setB(int b) {
		this.b=b;
	}
	
	public void setC(int c) {
		this.c=c;
	}
	
	public void setDelta() {
		delta= (b*b)-4*a*c;
	}
	
	public int getDelta() {
		return delta;
	}
	public void setX1() {
		int raizDelta= (int) Math.sqrt(delta);
		x1= ((-b) + raizDelta)/(2*a);
	}
	public void setX2 () {
		int raizDelta= (int) Math.sqrt(delta);
		x2= ((-b) - raizDelta)/(2*a);
	}
	public int getX1 () {
		return x1;
	} 
	public int getX2 () {
		return x2;
	} 
}
