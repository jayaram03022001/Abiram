package practiceproject;
import java.util.*;
public class TypeCasting {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Enter the value of n1:");
		n1=sc.nextInt();
		double d,d1;
		d=n1;
		System.out.println("Implicit TypeCasting");
		System.out.println("After Typecasting :"+d);
		d1=n1+5.6;
		System.out.println("After Typecasting :"+d1);
		System.out.println("Explict Typecasting");
		double d2;
		System.out.print("Enter the value of d2: ");
		d2=sc.nextDouble();
		int i1=(int)d2;
		System.out.println("After Typecasting : "+ i1);
		int v;
		System.out.print("Enter the value of v:");
		v=sc.nextInt();
		char c=(char)v;
		System.out.println("After Typecasting:"+c);
		
		
		
	}

}
