package com.polymorphism;

public class Overloading {
	
	public void food(int a) {
		System.out.println("Breakfast");
	}
    public void food(char b) {
    	System.out.println("Lunch");
    }
    public void food(int c,float d) {
    	System.out.println("Evening Break Time");
    }
    public void food(int e,char f,String g) {
        System.out.println("Dinner");
    }
    
    public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.food(12);
		obj.food('P');
		obj.food(34,23f);
		obj.food(66,'Q',"ABCD");
	}
}