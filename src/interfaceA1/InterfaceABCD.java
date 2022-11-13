package interfaceA1;

public class InterfaceABCD implements interfaceAB,InterfaceCD {
	
	public void laptop(String name1) {
		System.out.println("Your laptop is "+name1);
	}

	@Override
	public void Electronics(String name2) {
		System.out.println("Take your "+name2);
		
	}

	@Override
	public void mobiles1(String name1) {
		System.out.println(name1);
	}

	@Override
	public void mobiles2(int a2, String name2) {
		System.out.println("RAM is "+a2+" "+name2);
	}

	@Override
	public void mobiles3(int a3, String name3) {
		System.out.println("RAM is "+a3+" "+name3);
	}
	
	
	public static void main(String[] args) {
		
		InterfaceABCD obj = new InterfaceABCD();
		obj.laptop("HP");
		obj.Electronics("Charger");
		obj.mobiles1("VIVO");
		obj.mobiles2(12,"GB");				
		obj.mobiles3(8,"GB");
		
	}

	
	
	

}
