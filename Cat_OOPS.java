
public class Cat_OOPS extends Animal_OOPS
{
    String Cat_Name ;
    
    public Cat_OOPS()
    {
    	System.out.println(" This is a Cat");
    }
    
    public void Speak()
    {
    	System.out.println(" Meaw !");
    	super.Speak();
    }
}
