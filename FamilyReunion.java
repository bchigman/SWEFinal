import java.util.*;

public class FamilyReunion {

    String name = null;

    ArrayList<ArrayList<String>> families;
    
    ArrayList<ArrayList<Integer>> ages;

    public ArrayList<String> NamesOfFamilyContacts = new ArrayList<String>();
    
    public ArrayList<String> ContactPhoneNumbers;
    
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
    
    public String DisplayPhoneNumbers() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.ages.size(); i++) {
            builder.append(this.NamesOfFamilyContacts.get(i) + ": " + this.ContactPhoneNumbers.get(i) + "\n");
        }
        return builder.toString();
    }
    
    public String DisplayNames() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.ages.size(); i++) {
            builder.append("Coming with: " + this.NamesOfFamilyContacts.get(i) + "\n");
            for (int j = 0; j < this.families.get(i).size(); j++) {
                builder.append("  " + this.families.get(i).get(j) + "\n");
            }
        }
        return builder.toString();
    }
    
    public String DisplayNamesAndAges() {
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