
public class Dog_OOPS extends Animal_OOPS
{
    String Dog_Name;
    
    public Dog_OOPS()
    {
    	System.out.println(" This is a Dog");
    }
    
    public void Speak()
    {
    	System.out.println(" Bark ! ");
    	super.Speak();
    }
}
