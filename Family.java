import java.util.*;
/*
For use with FamilyReunion.java
@author Ben Higman
*/

public class Family{

	private String familyName;
	private ArrayList<Person> familyMembers;
	private Person contact;

	// Constructor
	public Family (String familyName, Person contact){
		this.familyName = familyName;
		this.contact = contact;
		this.familyMembers = new ArrayList<Person>();
		this.addPerson(contact);
	}

	// Method to add members to family
	public void addPerson(Person person){
		this.familyMembers.add(person);
	}


	public String displayFamily(){
		String s = "";
		for(Person person : this.familyMembers){
			s += person.getName() + "\n";
		}
		return s;
	}

	// toString implementation
	public String toString(){
		String s = "";
		for(Person person : this.familyMembers){
			//System.out.println(person);
			s += "" + person.toString() + "\n";
		}
		return s;
	}

	// Unit test
	public static void main(String[] args){
		Person ben = new Person(22, "Ben", "603-333-4444");
		Family family = new Family("Higman", ben);

		System.out.println(family);

		Person dan = new Person(20, "Dan");
		family.addPerson(dan);

		System.out.println(family.displayFamily());
	}
}