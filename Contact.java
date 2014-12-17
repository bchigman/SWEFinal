/*
For use with FamilyReunion.java
@author Ben Higman
*/

public class Contact extends Person{
	private String phoneNumber;

	public Contact(int age, String name, String phoneNumber){
		super(age, name);
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public String toString(){
		return super.toString() + " Phone: " + this.phoneNumber;
	}

	public static void main(String[] args){
		Contact contact = new Contact(22, "Ben", "603-333-4444");
		System.out.println(contact);
	}
}