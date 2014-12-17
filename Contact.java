/**
Contact person
For use with FamilyReunion.java
@author Ben Higman
*/

public class Contact extends Person{
	private String phoneNumber;

	/**
	Null constructor
    */
	public Contact(){
		super();
		this.phoneNumber = "";
	}

	/**
	Constructor for known name, age, and number
	@param int age of Contact
	@param String name of Contact
	@param String phoneNumber of Contact
    */
	public Contact(int age, String name, String phoneNumber){
		super(age, name);
		this.phoneNumber = phoneNumber;
	}

	/**
	Method sets the age of the contact
	@param int age of Contact
	*/
	public void setAge(int age){
		this.age = age;
	}

	/**
	Method sets name of the contact
	@param name of the Contact
	*/
	public void setName(String name){
		this.name = name;
	}

	/**
	Method to return the Contact's phone number
	@return String contact's phone number
    */
	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	/**
	Method sets the Contact's phone number
	@param String number Contact's phone number
    */
	public void setPhoneNumber(String number){
		this.phoneNumber = number;
	}

	/**
	Method returns the Contact's name and phone number as a String
	@return String name and number
    */
	public String toString(){
		return this.getName() + ": " + this.phoneNumber;
	}

	public static void main(String[] args){
		Contact contact = new Contact(22, "Ben", "603-333-4444");
		System.out.println(contact.getName());
		System.out.println(contact);
	}
}