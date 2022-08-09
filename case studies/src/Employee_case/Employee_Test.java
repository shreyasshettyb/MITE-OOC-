package Employee_case;
import java.util.*;
public class Employee_Test {
	public static void main(String args[])
	{
		int i,n=2;
		/*for N Employee Details
		System.out.println(Enter Number Of Employees");
		Scanner sc=new Scanner(System.in);*/
		Employee e[]=new Employee[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Employee();
		}
		System.out.println("Enter Employee Details:");
		for(i=0;i<n;i++)
		{
			e[i].set(i+1);
		}
		for(i=0;i<n;i++)
		{
			e[i].get(i+1);
		}
	}

}
