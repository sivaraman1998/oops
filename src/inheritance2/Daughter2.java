package inheritance2;

public class Daughter2 extends Father {
	
	@Override
	public void shopping() {
		super.shopping();
	}
	public void Footwears() {
        System.out.println("Shoes");
        System.out.println("Sandals");
	}
	
	public static void main(String[] args) {
		Daughter2 obj =new Daughter2();
		obj.shopping();
		obj.Footwears();
	}
		}


