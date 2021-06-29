package OopsProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		
		String school=sr.nextLine();
		int roll=sr.nextInt();
		String name=sr.nextLine();
		float marks=sr.nextFloat();
		
		
		Student s=new Student();
		s.setSchoolname(school);
		s.setName(name);
		s.setRoll(roll);
		
		s.setMarks(marks);
		
		
		System.out.println("School name :" + s.getSchoolname());
		
		System.out.println("Roll number :"+s.getRoll());
		System.out.println("Name :"+ s.getName());
		System.out.println("Marks :"+ s.getMarks());

	
	}
}
