package Area_case;
import java.util.*;
public class Area_Array_Demo {

	public static void main(String[] args) {
		float l,r,s,b;
		int ch,n;
		Scanner sc=new Scanner(System.in);
		Area a[] = new Area[100];
		while(true)
		{
			System.out.println("\nMenu\n1.Area Of Square\n2.Area Of Rectangle\n3.Area Of Circle\n4.Exit\nEnter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter Number Of Squares");
						n=sc.nextInt();
						for(int i=1;i<=n;i++)
							a[i]=new Area();
						for(int i=1;i<=n;i++)
						{
							System.out.println("Enter Length Of Square "+i+":");
							s=sc.nextFloat();
							a[i].SquareArea(s);
						}
						break;
				case 2:System.out.println("Enter Number Of Rectangles");
						n=sc.nextInt();
						for(int i=1;i<=n;i++)
							a[i]=new Area();
						for(int i=1;i<=n;i++)
						{
							System.out.println("Enter Length And Breadth Of Rectangle "+i+":");
							l=sc.nextFloat();
							b=sc.nextFloat();
							a[i].RectangleArea(l,b);
						}
						break;
				case 3:System.out.println("Enter Number Of Circles");
						n=sc.nextInt();
						for(int i=1;i<=n;i++)
							a[i]=new Area();
						for(int i=1;i<=n;i++)
						{
							System.out.println("Enter Radius Of Circle "+i+":");
							r=sc.nextFloat();
							a[i].CircleArea(r);
						}
						break;
				case 4:System.out.println("Thank You");
						System.exit(0);
				default:System.out.println("Invalid Input");
			}
		}
	}

}
