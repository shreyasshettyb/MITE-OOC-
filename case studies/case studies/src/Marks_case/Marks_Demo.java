package Marks_case;
import java.util.*;

public class Marks_Demo {
	public static void main(String args[])
	{
		int a,b,c,d;
		float r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Students A Marks:");
		System.out.println("Enter Marks Of 1st Subject:");
		a=sc.nextInt();
		System.out.println("Enter Marks Of 2nd Subject:");
		b=sc.nextInt();
		System.out.println("Enter Marks Of 3rd Subject:");
		c=sc.nextInt();
		stA ob1=new stA(a,b,c);
		r1=ob1.getPercentage();
		System.out.println("Enter Students B Marks:");
		System.out.println("Enter Marks Of 1st Subject:");
		a=sc.nextInt();
		System.out.println("Enter Marks Of 2nd Subject:");
		b=sc.nextInt();
		System.out.println("Enter Marks Of 3rd Subject:");
		c=sc.nextInt();
		System.out.println("Enter Marks Of 4th Subject:");
		d=sc.nextInt();
		stB ob2=new stB(a,b,c,d);
		r2=ob2.getPercentage();
		System.out.println("Average Of Student A: "+r1);
		System.out.println("Average Of Student B: "+r2);
	}
}
