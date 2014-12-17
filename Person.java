/**
Family Member
Person class for use with FamilyReunion.java
@author Ben Higman
*/

public class Person {

	protected int age;
	protected String name;

	/**
	Null constructor
    */
	public Person(){
		this.age = 0;
		this.name = "";
	}

	/**
	Constructor for known name and age
	@param int age of Person
	@param String name of Person
    */
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}

	/**
	Method returns a string the Person's name
	@return String name
    */
	public String getName(){
		return this.name;
	}

	/**
	Method returns an int of the person's age
	@return int age
    */
	public int getAge(){
		return this.age;
	}

	/**
	Method returns a string the Person's name and age
	@return String of name and age
    */
	public String toString(){
		return this.name + ", "+ this.age;
	}

	// Unit test
	public static void main(String[] args){
		Person jim = new Person(21, "Jim John");
		System.out.println(jim);
	}
}