package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}

	void sleep(){
		System.out.println(name + "is sleeping");
		
	}
}


public class Demo {
	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "joe";
		person1.email = "joe@testemail.com";
		person1.phone = "333 222 3345";
		
		// Abstraction - only want elements that are necessary for this time- allows for easy data extraction
		person1.walk();
		//
		person1.eat();
		//
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "sarah";
		person2.email = "sarah@testemail.com";
		person2.phone = "3235654321";
		
		person2.walk();
		person2.sleep();
		
		
		/*
		//Person-
		
		// Attributes, variables, adjectives, descriptors
		String name = "joe";
		String email = "joe@testemail.com";
		String phone = "8938939004";
		
		//Action, activity, behavior;
		//System.out.println(name + " is walking.");
		//System.out.println(name + " is eating.");
		walking(name);
		
		
		//What if we wanted to do this for another person?
		String name2 = "sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "3394402293";
		
		// Action, activity, behavior
		walking(name2);
		System.out.println(name2 + " is walking.");
		System.out.println(name2 + " is eating.");
		
		//What about binding attributes and properties together?
		

	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking.");
	*/
	}
}

