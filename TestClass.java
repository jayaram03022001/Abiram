interface Front
{
	default void show()
	{
		System.out.println("Page Front");
	}
}
interface Back
{
	default void show()
	{
		System.out.println("Page Back");
	}
}
public class TestClass implements Front,Back 
{
	public void show()
	{
		Front.super.show();
		Back.super.show();
	}
	public static void main(String args[])
	{
		TestClass ob=new TestClass();
		ob.show();
	}
}
	
