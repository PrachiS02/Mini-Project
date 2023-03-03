package java8features;
interface Display
{
	void display();
}

public class methodinterface {
	public void Method()
	{
		System.out.println("method references in java 8......");
	}

	public static void main(String[] args)
	{
		methodinterface obj = new  methodinterface();
		Display ref = obj::Method;
		ref.display();
       
	}

}
