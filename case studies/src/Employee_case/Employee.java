package Employee_case;
import java.util.*;

public class Employee {
	String fname,lname;
	double s;
	Scanner sc=new Scanner(System.in);
	Employee()
	{
		fname=new String();
		lname=new String();
		s=0;
	}
	void set(int i)
	{
	
			System.out.println("Enter Details Of Employee "+i+":");
			System.out.println("Enter First Name:");
			fname=sc.next();
			System.out.println("Enter Last Name:");
			lname=sc.next();
			System.out.println("Enter Monthly Salary:");
			s=sc.nextDouble();
			if(s<0)
				s=0;
	}
	void get(int i)
	{
		System.out.println("Details Of Employee "+i+":");
		System.out.println("First Name: "+fname);
		System.out.println("Enter Last Name: "+lname);
		System.out.println("Enter Monthly Salary: "+s);
		System.out.println("Enter Year Salary: "+s*12);
		System.out.println("Enter Year Salary With 10% Raise: "+(s*12+0.1*(s*12))+"\n");
	}
}
