
public class encapculation {

	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public static void main(String[] args) {
		encapculation c=new encapculation();
		c.setA(20);
		c.setB(40);
		System.out.println(c.getA());
		System.out.println(c.getB());
		System.out.println(c.getA()+c.getB());
	}
	
	
}
