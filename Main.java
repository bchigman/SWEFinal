import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("What is the name of this family?");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            FamilyReunion reunion = new FamilyReunion(input.readLine());
            while (true) {
                System.out.println("What would you like to do?");
                int i = 1;
                System.out.println(i + ": Add a new attending (sub)family.");
                i++;
                System.out.println(i + ": See attendees' names.");
                i++;
                System.out.println(i + ": See contacts' phone numbers.");
                i++;
                System.out.println(i + ": See names and ages.");
                i++;
                System.out.println(i + ": See guests with total people.");
                i++;
                System.out.println(i + ": Exit registry.");
                int selection = Integer.parseInt(input.readLine());
                i = 1;
                if (selection == i) {
                    addGuest(reunion, new Family());
                }
                i++;
                if (selection == i) {
                    System.out.println(reunion.displayNames());
                }
                i++;
                if (selection == i) {
                    System.out.println(reunion.displayPhoneNumbers());
                }
                i++;
                if (selection == i) {
                    System.out.println(reunion.displayNamesAndAges());
                }
                i++;
                if (selection == i) {
                    System.out.println(reunion);
                }
                i++;
                if (selection == i) {
                    System.exit(0);
                }
            }
            
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
    public static void addGuest(FamilyReunion reunion, Family family) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("What is the person's name?");
            String name = input.readLine();

            System.out.println("How old is the person?");
            int age = Integer.parseInt(input.readLine());

            Person guest = new Person(age, name);
            family.addPerson(guest);
            System.out.println("Want to add someone else? (y/n)");

            if (input.readLine().toLowerCase().equals("y")) {
                addGuest(reunion, family);
            } else {
                System.out.println("What is the contact's phone number?");
                String phone = input.readLine();
                family.getContact().setName(family.getFamilyMember(0).getName());
                family.getContact().setPhoneNumber(phone);
                reunion.addFamily(family);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}