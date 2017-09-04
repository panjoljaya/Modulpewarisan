package latihan3;

public class gajah extends hewan
{
	public static void testclass(){
		System.out.println("The class method in hewan...");
	}
	
	public void testinstance(){
		System.out.println("The instance method in gajah...");
	}
	
	public static void main(String [] args)
	{
		gajah mygajah = new gajah();
		hewan myhewan = new hewan();
		hewan.testclass();
		mygajah.testinstance();
	}
}