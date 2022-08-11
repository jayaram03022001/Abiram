package practiceproject;
public class MethodOverload {
	public void calculate(int a,int b){
		System.out.println("Area of Rectangle :"+(a*b));
		
	}
	public void Calculate(double r){
		System.out.println("Area of Circle :"+(3.14)*(r*r));
	}
	public void Calculate(double c,double d)
	{
		System.out.println("The Sum of Two number :"+(c+d));
	}
	public static void main(String args[])
	{
		MethodOverload ob = new MethodOverload();
		ob.Calculate(5);
		ob.Calculate(2,3);
		ob.Calculate(2.3,3.7);
		
		
	
		
	}

}
