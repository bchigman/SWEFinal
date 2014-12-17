import java.util.*;

/*
CS 4141 Final Assignment
@author Kyle Burke 
edited by:Ben Higman
*/

public class FamilyReunion {

    private String name;

    private ArrayList<ArrayList<String>> families;
    
    private ArrayList<ArrayList<Integer>> ages;

    private ArrayList<String> NamesOfFamilyContacts;
    
    private ArrayList<String> ContactPhoneNumbers;
    
    public FamilyReunion(String name) {
        this.name = name;
        this.families = new ArrayList<ArrayList<String>>();
        this.ages = new ArrayList<ArrayList<Integer>>();
        this.ContactPhoneNumbers = new ArrayList<String>();
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int numberMembers = 0;
        for (int i = 0; i < this.ages.size(); i++) {
            builder.append("Coming with: " + this.NamesOfFamilyContacts.get(i) + "\n");
            for (int j = 0; j < this.families.get(i).size(); j++) {
                builder.append("  " + this.families.get(i).get(j) + "\n");
                numberMembers ++;
            }
        }
        return "The " + this.name + " Family Reunion!\n" + "Guests: " + numberMembers + "\n" + builder.toString();
        
    }
    
    public void addOnePersonFamily(String personName, int age, String phone) {
        this.families.add(new ArrayList<String>());
        this.families.get(this.families.size()-1).add(personName);
        this.ages.add(new ArrayList<Integer>());
        this.ages.get(this.ages.size()-1).add(new Integer(age));
        this.ContactPhoneNumbers.add(phone);
        this.NamesOfFamilyContacts.add(personName);
    }
    
    //adds a subfamily with multiple people.  Precondition: the first element in names is the name of the contact person.
    public void addMultiPersonFamily(String phone, ArrayList<String> names, ArrayList<Integer> ages) {
        this.families.add(names);
        this.ages.add(ages);
        this.ContactPhoneNumbers.add(phone);
        this.NamesOfFamilyContacts.add(names.get(0));
    }
    
    public String displayPhoneNumbers() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.ages.size(); i++) {
            builder.append(this.NamesOfFamilyContacts.get(i) + ": " + this.ContactPhoneNumbers.get(i) + "\n");
        }
        return builder.toString();
    }
    
    public String displayNames() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.ages.size(); i++) {
            builder.append("Coming with: " + this.NamesOfFamilyContacts.get(i) + "\n");
            for (int j = 0; j < this.families.get(i).size(); j++) {
                builder.append("  " + this.families.get(i).get(j) + "\n");
            }
        }
        return builder.toString();
    }
    
    public String displayNamesAndAges() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.ages.size(); i++) {
            builder.append("Coming with: " + this.NamesOfFamilyContacts.get(i) + "\n");
            for (int j = 0; j < this.families.get(i).size(); j++) {
                builder.append("  " + this.families.get(i).get(j) + ", " + this.ages.get(i).get(j) + "\n");
            }
        }
        return builder.toString();
    }
    
    //public String displayOldestWithAge() {...}  TODO: make this work!
    public static void main(String[] args) {
            
    
    }
}