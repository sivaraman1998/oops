package inheritance2;

public class Daughter1 extends Father {
     @Override
	public void shopping() {
	    super.shopping();
	}
	public void jewels() {
		System.out.println("Earrings");
		System.out.println("Bangles");
	}
	public static void main(String[] args) {
		
		 Daughter1 obj = new Daughter1();
		 obj.shopping();
		 obj.jewels();
	}
		
	
}
