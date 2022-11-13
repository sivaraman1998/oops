package com.polymorphism;

public class Overriding extends Overloading {
	
	@Override
	public void food(int a) {
		super.food(a);
		System.out.println("Dosa");
	}
    @Override
    public void food(char b) {
    	super.food(b);
    	System.out.println("Chicken Briyani");
    }
    @Override
    public void food(int c, float d) {
    	super.food(c, d);
    	System.out.println("Tea nd Snacks");
    }
    @Override
    public void food(int e, char f, String g) {
    	super.food(e, f, g);
    	System.out.println("Butter Naan nd butter chicken Masala");
    }
    
    public static void main(String[] args) {
		
    	Overriding obj= new Overriding();
    	obj.food(12);
    	obj.food('R');
    	obj.food(13, 10f);
    	obj.food(44, 'S', "foodiee");
	}
}
