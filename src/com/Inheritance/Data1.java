package com.Inheritance;

public class Data1 extends Data {
	
	@Override
	public void amazon() {
		
	   this.mobile();
        super.amazon();
		System.out.println("Grocery");
	}
	
	@Override
	public void laptop() {
		super.laptop();
		System.out.println("Mac book");
	}
	
	private void mobile() {
		System.out.println("Redmi");
		
	
    }	
	public static void main(String[] args) {
         Data1 obj = new Data1();
         obj.amazon();
         obj.laptop();
         obj.mobile();
         obj.laptop();
	}
}
