import java.util.*;
/**
Family at reunion
For use with FamilyReunion.java
@author Ben Higman
*/

public class Family{

	private ArrayList<Person> familyMembers;
	private Contact contact;

	/**
	Default constructor
    */
	public Family() {
		this.contact = new Contact();
		this.familyMembers = new ArrayList<Person>();
	}

	/**
	Generates a family with a predefined contact
	@param contact Contact object for the family
    */
	public Family(Contact contact){
		this.contact = contact;
		this.familyMembers = new ArrayList<Person>();
		this.addPerson(contact);
	}

	/**
	Method adds a person to the family object
	@param person Person to be added
    */
	public void addPerson(Person person){
		this.familyMembers.add(person);
	}

	/**
	Method to return a list of family members
	@return ArrayList<Person> people in the family
    */
	public ArrayList<Person> getFamilyMembers(){
		return this.familyMembers;
	}

	/**
	Method to return family member at the given index
	@param i int index location
    */
	public Person getFamilyMember(int i){
		return this.familyMembers.get(i);
	}

	/**
	Method to return the Family object's Contact
	@return Contact a contact for the family
    */
	public Contact getContact(){
		return this.contact;
	}

	/**
	Method to set the Family object's Contact
	@param contact Contact to set
    */
	public void setContact(Contact contact){
		this.contact = contact;
	}

	/**
	Method returns a string of names of the family
	@return String names
    */
	public String displayNames(){
		String s = "";
		for(Person person : this.familyMembers){
			s += " " + person.getName() + "\n";
		}
		return s;
	}

	/**
	Method returns a string of names and ages of the family
	@return String names and ages
    */
	public String displayNamesAndAges(){
		String s = "";
		s += "Coming with: " + this.contact.getName() + "\n";
		for(Person person : this.familyMembers){
			s += " " + person.getName() + ", " + person.getAge() +"\n";
		}
		return s;
	}

	/**
	Method returns size of the family
	@return int size
    */
	public int getFamilySize(){
		return this.familyMembers.size();
	}

	/**
	Method returns a string of members of the family
	@return String toString
    */
	public String toString(){
		String s = "";
		s = "Coming with: " + this.contact.getName() + "\n" + this.displayNames();
		return s;
	}

	// Unit test
	public static void main(String[] args){
		Contact ben = new Contact(22, "Ben", "603-333-4444");
		Family family = new Family(ben);

		System.out.println(family);

		Person dan = new Person(20, "Dan");
		family.addPerson(dan);

		System.out.println(family.displayNames());

		System.out.println(family.displayNamesAndAges());

		System.out.println(family.getContact());
	}
}