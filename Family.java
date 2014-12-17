import java.util.*;
/*
For use with FamilyReunion.java
@author Ben Higman
*/

public class Family{

	private ArrayList<Person> familyMembers;
	private Person contact;

	// Constructor
	public Family (Contact contact){
		this.contact = contact;
		this.familyMembers = new ArrayList<Person>();
		this.addPerson(contact);
	}

	// Method to add members to family
	public void addPerson(Person person){
		this.familyMembers.add(person);
	}


	// getContact method: for getting this family's contact
	public Person getContact(){
		return this.contact;
	}

	// displayNames method: displays only names of those in family
	public String displayNames(){
		String s = "";
		for(Person person : this.familyMembers){
			s += person.getName() + "\n";
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
		for(Person person : this.familyMembers){
			s += "" + person.toString() + "\n";
		}
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

		System.out.println(family.getContact());
	}
}