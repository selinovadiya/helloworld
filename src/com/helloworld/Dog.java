package com.helloworld;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	
	public Dog (String DogName, String DogBreed, int DogAge, String DogColor) {
		name = DogName;
		breed = DogBreed;
		age = DogAge;
		color = DogColor;
	}

		public String getName() {
		return name;	
		}
		
		public String getBreed() {
		return breed;
		}
		
		public int getAge() {
		return age;
		}
		
		public String getColor() {
		return color;
			
		}
		public static void main(String[] args) {
		Dog mydog = new Dog ("Sparkles", "Husky", 1, "blue");
				
		String puppyname = mydog.getName();
		String breedname = mydog.getBreed();
		int dogage = mydog.getAge();
		String dogcolor = mydog.getColor();
		
		System.out.println(puppyname);
		System.out.println(breedname);
		System.out.println(dogage); 
		System.out.println(dogcolor);
		

	}

}
