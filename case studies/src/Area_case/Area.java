package Area_case;

public class Area extends Shape {
	void RectangleArea(float l,float b)
	{
		System.out.println("Area Of Rectangle: "+l*b);
	}
	void SquareArea(float s)
	{
		System.out.println("Area Of Square: "+s*s);
	}
	void CircleAreaa(float r)
	{	double  pi= 3.14;
		System.out.println("Area Of Circle: "+pi*r*r);
	}
}
