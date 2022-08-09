package Area_case;
import java.util.*;
public class Area_Demo {
	public static void main(String args[])
	{
		float l,r,s,b;
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length And Breadth Of Rectangle:");
		l=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Enter Radius Of Circle:");
		r=sc.nextFloat();
		System.out.println("Enter Length Of Square:");
		s=sc.nextFloat();
		a.RectangleArea(l, b);
		a.CircleAreaa(r);
		a.SquareArea(s);
	}

}
