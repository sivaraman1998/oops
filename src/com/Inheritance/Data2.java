package com.Inheritance;

public class Data2 extends Data1 {
	
	@Override
	public void amazon() {
		super.amazon();
	}
	
	@Override
	public void laptop() {
		super.laptop();
		System.out.println("Asus");
	}
	
	public static void main(String[] args) {
		
		Data2 obj = new Data2();
		obj.amazon();
		obj.laptop();
	}

}
