
public class Overloading_OOPS 
{

	public void print()
	{
		System.out.println("Hello");
	}
	
	public void print(int n) // Method Overloading with same name but integer as argument
	{
		System.out.println("Hello "+n);
	}
	
	public void print(float n)  // Method Overloading with same name but float as argument
	{
		System.out.println("Hello "+n);
	}
}
