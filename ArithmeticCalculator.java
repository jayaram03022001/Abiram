package practiceproject;
import java.util.*;
public class ArithmeticCalculator {
	public int Addition(int a,int b){
		int res=(a+b);
		return res;
	}
	public int Subraction(int c,int d){
		int res=(c-d);
		return res;
	}
	public int Multiplication(int e,int f){
		int res=(e*f);
		return res;
	}
	public int Division(int x,int y){
		int res=(x/y);
		return res;
	}
	public static void main(String args[])
	{
		ArithmeticCalculator ob = new ArithmeticCalculator();
		int num1;
		int num2;
		 
		int result;
		Scanner sc =new Scanner(System.in);
		System.out.printf("Enter the value of num1 :");
		num1=sc.nextInt();
		System.out.printf("Enter the value of num2 :");
		num2=sc.nextInt();
		System.out.print("Enter the character to be performed between two value:");
		char operator=sc.next().charAt(0);
		if(operator=='+'){
			result=ob.Addition(num1,num2);
			System.out.print("The Addition of two values are :"+result);
		}
		else if(operator=='-'){
			result = ob.Subraction(num1,num2);
			System.out.print("The Subraction of two values are :"+result);
		}
		else if(operator=='*'){
			result = ob.Multiplication(num1,num2);
		System.out.print("The Multiplication	of two values are :"+result);
		}
		else{
			result=ob.Division(num1, num2);
			System.out.println("The Division of two values are :"+result);
		}
	
		
	}
	
}
			
			
		
			
			
		
			
			
			
		
		
	
		

				

