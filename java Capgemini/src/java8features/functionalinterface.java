package java8features;
@FunctionalInterface   //optional 
interface Functional//functional interface
{
	void greeting();//one abstract method
}

public abstract class functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional wf=()->System.out.println("Welcome to java 8 features.......");
		 wf.greeting();

	}

}
