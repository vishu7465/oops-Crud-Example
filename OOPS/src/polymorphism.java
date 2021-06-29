
public class polymorphism {

	int a;
	int b;
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public double sum(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		polymorphism p=new polymorphism();
		double o=p.sum(1, 1.2);
		
		System.out.println(o);
		
		
	}
	
}
