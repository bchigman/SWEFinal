import java.util.*;

/*
CS 4141 Final Assignment
@author Kyle Burke 
edited by:Ben Higman
*/

public class FamilyReunion {
    
    private ArrayList<Family> families;
    private String reunionName;
    
    public FamilyReunion(String reunionName) {
        this.reunionName = reunionName;
        this.families = new ArrayList<Family>();
    }
    
    //adds a subfamily.
    public void addFamily(Family family) {
        this.families.add(family);
    }
    
    public int getGuestNumber(){
        int guests = 0;
        for(Family family : this.families){
            guests += family.getFamilySize();
        }
        return guests;
    }

    public String displayPhoneNumbers() {
       String s = "";
       for(Family family : this.families){
            s += family.getContact() + "\n";
       }
       return s;
    }
    
    public String displayNames() {
       String s = "";
       for(Family family : this.families){
            s += "" + family + "\n";
       }
       return s;
    }
    
    public String displayNamesAndAges() {
        String s = "";
         s += "The " + this.reunionName + " Family Reunion!\n" + "Guests: " + this.getGuestNumber() + "\n";
        for(Family family : this.families){
           s += family.displayNamesAndAges();
        }
        return s;
    }

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