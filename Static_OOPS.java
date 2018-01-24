
public class Static_OOPS 
{
 
	static int a=10;
	int b;
	
	public Static_OOPS()
	{
		System.out.println(" Constructor runs after static block ! ");
	}
	
	static
	{               // Static Block Starts
	                           	
		System.out.println(" This is the Static Block ! ");
		System.out.println(" The value of static variable : "+a);
		
	}               // Static Block ends
}
