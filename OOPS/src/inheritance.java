import java.util.Scanner;

public class inheritance {

	
	static double salary=50000;
    static int houserent=5000;
     static double  bills=3500.70;
 	
 	 
 	
 
class a extends inheritance{
  
     public void totalsalary() {
	System.out.println("total salary is :" + salary);
	
	
	
}
public void salaryafterrent() {
	 
	System.out.println("rent is 5000");
	System.out.println("Do you want to give rent now :" );
	System.out.println("Type yes or no");
	 Scanner ss=new Scanner(System.in);
	  	Boolean yes=ss.hasNext();
	  	Boolean no=ss.hasNext();
	  	
	 if(ss.equals(yes)) {
		System.out.println("Latest Salary is : " +(salary-houserent));
	}else if(ss.equals(no)){
		System.out.println("Current salary :" + salary);
	}
	
	
}
	public void restsalary() {
		System.out.println("bills cost are 3500.70");
		System.out.println("rest salary is :" +(salary-(houserent + bills)));
		
	}

	
}	
	
public static void main(String[] args) {
		
	inheritance t=new inheritance();
	t.new a().totalsalary();
	t.new a().salaryafterrent();
	t.new a().restsalary();
}
	
}
