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
                int selection = Integer.parseInt(input.readLine());
                i = 1;
                if (selection == i) {
                    addAPerson(reunion, new ArrayList<Integer>(), new ArrayList<String>());
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
            }
            
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
    public static void addAPerson(FamilyReunion reunion, ArrayList<Integer> ages, ArrayList<String> names) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("What is the person's name?");
            String name = input.readLine();
            System.out.println("How old is the person?");
            int age = Integer.parseInt(input.readLine());
            ages.add(age);
            names.add(name);
            System.out.println("Want to add someone else? (y/N)");
            if (input.readLine().toLowerCase().equals("y")) {
                addAPerson(reunion, ages, names);
            } else {
                System.out.println("What is the contact's phone number?");
                String phone = input.readLine();
                if (ages.size() == 1) {
                    reunion.addOnePersonFamily(names.get(0), ages.get(0), phone);
                } else {
                    reunion.addMultiPersonFamily(phone, names, ages);
                }
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}