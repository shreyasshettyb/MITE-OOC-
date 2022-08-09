package Marks_case;

public class stA extends Marks {
	int m1,m2,m3;
	stA(int a,int b,int c){
		m1=a;
		m2=b;
		m3=c;
	}
	float getPercentage()
	{
		return(m1+m2+m3)/3;
	}
}
