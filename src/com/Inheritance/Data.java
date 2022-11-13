package com.Inheritance;

public class Data {
	
	public void amazon() {
	   System.out.println("Electronics");
	   System.out.println("Fashions");
	}
	
    public void laptop() {
    	System.out.println("Dell");
    	System.out.println("HP");
    }
	
    private void aadition() {
    	int a=12;
    	int b=13;
    	int c=a+b;
    	System.out.println("c");
    }
    
    public static void main(String[] args) {
    	
//       classNamw obj.name = new class name();
    	 Data obj=new Data();
    	 obj.amazon();
    	 obj.aadition();
    	 obj.laptop();
	}
}	
	
