package hello;
interface language1
{
	void langdetails();
}
interface language2
{
	default void oldlangdetails1()
	{
		System.out.println("old language is Sanskrit");
	}
	static void newlangdetails2()
	{
		System.out.println("new language is English");
	}
}
public class interfacedemo implements language1,language2
{
		public static void main(String[] args) {
			interfacedemo id=new interfacedemo();
			id.langdetails();
			id.oldlangdetails1();
			language2.newlangdetails2();
	}
	@Override
	public void langdetails() {
		System.out.println("all languages");
	}

}

