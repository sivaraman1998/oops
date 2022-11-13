package keywords;

public class Final2 extends Final1{
	@Override
	public void school() {
		super.school();
    	System.out.println("A=12TH STANDARD");
    }
	@Override
	public void addition() {
		super.addition();
		   int c=5;
		   float d=3;
		System.out.println("c+d="+(c+d));
	}
     public static void main(String[] args) {
		Final2 obj=new Final2();
		  college();
		  obj.school();
		  obj.addition();
		  obj.hospitals();
		  obj.company();
		
	}
}

