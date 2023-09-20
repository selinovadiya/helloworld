package com.helloworld;

public class Fruit {

	static String name;
	String color;
	
	public Fruit (String Fruitname, String Fruitcolor) {
		
		name = Fruitname;
		color = Fruitcolor;
	}
	
	public static String getName() {
		return name;
		
	}
	public static void main(String[] args) {
		Fruit myfruits = new Fruit ("Mango", "Yellow");
	}

}
