package hello;
abstract class vehicle {
	
    public abstract void Drive(); 
    
}

class Coupe extends vehicle {


    public void Drive() {
        System.out.println("Driving fast...");
    }
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Coupe coupe = new Coupe();
        coupe.Drive();
	}

}
