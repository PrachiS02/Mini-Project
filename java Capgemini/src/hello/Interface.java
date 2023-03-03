package hello;
interface FirstInterface {
	  public void myMethod(); 
	}

	interface SecondInterface {
	  public void myOtherMethod(); 
	}

	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  public void myOtherMethod() {
	    System.out.println("Some other text...");
	  }
	}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	}

}
