/*
Person class for use with FamilyReunion.java
@author Ben Higman
*/

public class Person {

	private int age = 0;
	private String name;
	private String phone;

	// Normal person constructor
	public Person(int age, String name){
		this.age = age;
		this.name = name;
		this.phone = "";
	}

	// Contact person constructor
	public Person(int age, String name, String phone){
		this.age = age;
		this.name = name;
		this.phone = phone;
	}

	// getName method
	public String getName(){
		return this.name;
	}

	// toString method
	public String toString(){
		String s = "";
		s = this.name + " age: "+ this.age;
		if(!this.phone.isEmpty()){
			s += " Phone: " + this.phone;
		}
		return s;
	}

	// Unit test
	public static void main(String[] args){
		Person jim = new Person(21, "Jim John");
		Person bob = new Person(23, "Bob Dude", "603-333-4444");
		System.out.println(jim);
		System.out.println(bob);
	}
}