/*
Person class for use with FamilyReunion.java
@author Ben Higman
*/

public class Person {

	private int age = 0;
	private String name;

	// Normal person constructor
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}

	// getName method
	public String getName(){
		return this.name;
	}

	// toString method
	public String toString(){
		return this.name + " age: "+ this.age;
	}

	// Unit test
	public static void main(String[] args){
		Person jim = new Person(21, "Jim John");
		Person bob = new Person(23, "Bob Dude");
		System.out.println(jim);
		System.out.println(bob);
	}
}