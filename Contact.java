/*
For use with FamilyReunion.java
@author Ben Higman
*/

public class Contact extends Person{
	private String phoneNumber;

	// null constructor
	public Contact(){
		super();
		this.phoneNumber = "";
	}

	public Contact(int age, String name, String phoneNumber){
		super(age, name);
		this.phoneNumber = phoneNumber;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setPhoneNumber(String number){
		this.phoneNumber = number;
	}

	public String toString(){
		return this.getName() + ": " + this.phoneNumber;
	}

	public static void main(String[] args){
		Contact contact = new Contact(22, "Ben", "603-333-4444");
		System.out.println(contact.getName());
		System.out.println(contact);
	}
}