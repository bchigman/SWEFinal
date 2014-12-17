/*
Person class for use with FamilyReunion.java
@author Ben Higman
*/

public class Person {

	private int age;
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

	// getAge method
	public int getAge(){
		return this.age;
	}

	// toString method
	public String toString(){
		return this.name + ", "+ this.age;
	}

	// Unit test
	public static void main(String[] args){
		Person jim = new Person(21, "Jim John");
		System.out.println(jim);
	}
}