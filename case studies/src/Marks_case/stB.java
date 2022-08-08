package Marks_case;

public class stB extends Marks{
	int m1,m2,m3,m4;
	stB(int a,int b,int c,int d){
		m1=a;
		m2=b;
		m3=c;
		m4=d;
	}
	float getPercentage()
	{
		return(m1+m2+m3+m4)/4;
	}
}
