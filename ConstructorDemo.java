package practiceproject;

public class ConstructorDemo 
{
   
	double res;
	public ConstructorDemo()
	{
		
	}
	public ConstructorDemo(int a)
	{
		res= (a*a);
		
	}
	public ConstructorDemo(int l,int w)
	{
		res=(1*w);
		
	}
	public ConstructorDemo(double r)
	{
		res =(3.14 *(r*r));
		
	}
	public void display(int a)
	{
		ConstructorDemo ob = new ConstructorDemo(a);
		System.out.println(ob.res);
	}
	public void display(int l,int w)
	{
		ConstructorDemo ob=new ConstructorDemo(l,w);
		System.out.println(ob.res);
	}
	public void display(double r)
	{
		ConstructorDemo ob = new ConstructorDemo(r);
		System.out.println(ob.res);
	}
	public double calculate(int d1,int d2)
	{
		double res;
		res=((d1*d2)/2);
		return res;
	}
	public static void main(String[] args)
	{
		ConstructorDemo ob = new ConstructorDemo();
		ob.display(5);
		ob.display(4,5);
		ob.display(3.0);
		System.out.println(ob.calculate(2, 7));
		
	
		
	
	}
}
