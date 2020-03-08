public class NewAb {
public static void main(String ars[])
{
	Ani myleo=new leo();
		myleo.meshi();
		myleo.sleep();
}
}



public class leo extends Ani{

	
	public void meshi() {
		
			System.out.println("Sheep");
	}

	
	
	
}



abstract public class Ani {
	public abstract void meshi();
	
	public void sleep()
	{
		System.out.println("zzzz");
	}
}
