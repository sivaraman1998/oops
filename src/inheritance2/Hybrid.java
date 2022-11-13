package inheritance2;

public class Hybrid extends Daughter1 {

	@Override
	public void shopping() {
		super.shopping();
		System.out.println("Toys");
	}
	
	public static void main(String[] args) {
		Hybrid obj = new Hybrid();
		obj.shopping();
		obj.jewels();
		
	}
	

}
