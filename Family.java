import java.util.*;
/*
For use with FamilyReunion.java
@author Ben Higman
*/

public class Family{

	private ArrayList<Person> familyMembers;
	private Contact contact;

	// Constructors
	public Family() {
		this.contact = new Contact();
		this.familyMembers = new ArrayList<Person>();
	}

	public Family(Contact contact){
		this.contact = contact;
		this.familyMembers = new ArrayList<Person>();
		this.addPerson(contact);
	}

	// Method to add members to family
	public void addPerson(Person person){
		this.familyMembers.add(person);
	}

	// method to return the arraylist representation of the family
	public ArrayList<Person> getFamilyMembers(){
		return this.familyMembers;
	}

	public Person getFamilyMember(int i){
		return this.familyMembers.get(i);
	}

	// getContact method: for getting this family's contact
	public Contact getContact(){
		return this.contact;
	}

	// setContact method
	public void setContact(Contact contact){
		this.contact = contact;
	}

	// displayNames method: displays only names of those in family
	public String displayNames(){
		String s = "";
		for(Person person : this.familyMembers){
			s += " " + person.getName() + "\n";
		}
		return s;
	}

	public String displayNamesAndAges(){
		String s = "";
		s += "Coming with: " + this.contact.getName() + "\n";
		for(Person person : this.familyMembers){
			s += " " + person.getName() + ", " + person.getAge() +"\n";
		}
		return s;
	}

	// getFamilySize method: returns the size of the family
	public int getFamilySize(){
		return this.familyMembers.size();
	}

	// toString implementation
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