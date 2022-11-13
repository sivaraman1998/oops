package inheritance2;

public class Daughter3 extends Father {
	@Override
	public void shopping() {
		super.shopping();
	}
	public void watches() {
		System.out.println("Fastrack");
		System.out.println("Titan");
	}
    public static void main(String[] args) {
		
		Daughter3 obj =new Daughter3();
		obj.shopping();
		obj.watches();
	}
}
