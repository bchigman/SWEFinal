import java.util.*;

/**
CS 4141 Final Assignment
@author Kyle Burke 
edited by:Ben Higman
*/

public class FamilyReunion {
    
    private ArrayList<Family> families;
    private String reunionName;
    
    /**
    Construstor
    @param reunionName String name of the reunion
    */
    public FamilyReunion(String reunionName) {
        this.reunionName = reunionName;
        this.families = new ArrayList<Family>();
    }
    
    /**
    Method to add families to the collection
    @param family Family to be added
    */
    public void addFamily(Family family) {
        this.families.add(family);
    }
    
    /**
    Method returns a number of guests at the reunion
    @return int representation of the number of guests
    */
    public int getGuestNumber(){
        int guests = 0;
        for(Family family : this.families){
            guests += family.getFamilySize();
        }
        return guests;
    }

    /**
    Method returns the contacts of all families
    @return String of contacts
    */
    public String displayPhoneNumbers() {
       String s = "";
       for(Family family : this.families){
            s += family.getContact() + "\n";
       }
       return s;
    }
    
    /**
    Method returns names of all guests
    @return String of all names
    */
    public String displayNames() {
       String s = "";
       for(Family family : this.families){
            s += "" + family + "\n";
       }
       return s;
    }
    
    /**
    Method returns names and ages of all guests
    @return String all names and ages
    */
    public String displayNamesAndAges() {
        String s = "";
         s += "The " + this.reunionName + " Family Reunion!\n" + "Guests: " + this.getGuestNumber() + "\n";
        for(Family family : this.families){
           s += family.displayNamesAndAges();
        }
        return s;
    }

    /**
    Method toString
    @return String all names
    */
    public String toString() {
        return "The " + this.reunionName + " Family Reunion!\n" 
            + "Guests: " + this.getGuestNumber() + "\n" + this.displayNames();
    }
    
    //public String displayOldestWithAge() {...}  TODO: make this work!

    // Unit tests
    public static void main(String[] args) {
        FamilyReunion reunion = new FamilyReunion("Higman");
        Family family = new Family(new Contact(22, "Ben Higman", "603-333-4444"));
        reunion.addFamily(family);

        System.out.println(reunion.displayPhoneNumbers());
        System.out.println(reunion);
        System.out.println(reunion.displayNames());
        System.out.println(reunion.displayNamesAndAges());
    
    }
}