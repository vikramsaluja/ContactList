import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {

    private ArrayList<Person> contacts;

    // ContactList Constructor
    public ContactList(ArrayList<Person> contacts){
        this.contacts = new ArrayList<Person>();
        this.contacts = contacts;
    }

    // Getter
    public ArrayList<Person> getContacts(){
        return this.contacts;
    }

    // Add new contact
    public void addContact(Person person){
        contacts.add(person);
    }

    // Print out all the contacts
    public void printContacts(){
        for(int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
    }

    // Search by first name
    public Person searchFirstName(String firstName){
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getFirstName().equals(firstName)){
                return contacts.get(i);
            }
        }
        return null;
    }

    // Search by last name
    public Person searchLastName(String lastName){
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getLastName().equals(lastName)){
                return contacts.get(i);
            }
        }
        return null;
    }

    // Search by phone number
    public Person searchPhoneNumber(String phoneNumber){
        for (Person contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
    // List all the students
    public void listStudents(){
        for (Person contact : contacts) {
            if (contact instanceof Student) {
                System.out.println(contact);
            }
        }
    }
  public void sort(int sortBy) {
        if(sortBy == 0){
            sortFirstName();
        }
        else if(sortBy == 1){
            sortLastName();
        }
        else if(sortBy == 2){
            sortPhoneNumber();
        }
  }
  // Sort by phone number
      public void sortPhoneNumber () {
          for (int i = contacts.size(); i > 0; i--) {
              for (int j = 0; j < i - 1; j++) {
                  if (contacts.get(j).getPhoneNumber().compareTo(contacts.get(j + 1).getPhoneNumber()) > 0) {
                      Person t = contacts.get(j);
                      contacts.set(j, contacts.get(j + 1));
                      contacts.set(j + 1, t);
                  }
              }
          }
      }
      // Sort by first name
      public void sortFirstName () {
          for (int i = contacts.size(); i > 0; i--) {
              for (int j = 0; j < i - 1; j++) {
                  if (contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName()) > 0) {
                      Person t = contacts.get(j);
                      contacts.set(j, contacts.get(j + 1));
                      contacts.set(j + 1, t);
                  }
              }
          }
      }
      // Sort by last name
      public void sortLastName () {
          for (int i = contacts.size(); i > 0; i--) {
              for (int j = 0; j < i - 1; j++) {
                  if (contacts.get(j).getLastName().compareTo(contacts.get(j + 1).getLastName()) > 0) {
                      Person t = contacts.get(j);
                      contacts.set(j, contacts.get(j + 1));
                      contacts.set(j + 1, t);
                  }
              }
          }
      }




    public void run(){
        System.out.println("\nWelcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
      Scanner input = new Scanner(System.in);
      int in = -1;
      while(in != 0 ){
            System.out.println("\nMenu:");
            System.out.println("1. Add Contacts\n2. List All Contacts by First Name\n3. List All Contacts by Last Name\n" +
                    "4. List All Contacts by Phone Number\n5. List All Students\n6. Search by First Name\n" +
                    "7. Search by Last Name\n8. Search by Phone Number\n0. Exit");
            in = input.nextInt();
            input.nextLine();
            // Add Contact
            if(in == 1){
                System.out.println("First Name:");
                String first = input.nextLine();
                System.out.println("Last Name:");
                String last = input.nextLine();
                System.out.println("Phone #:");
                String num = input.nextLine();

                // Create new person with new attributes
                Person add = new Person(first, last, num);
                contacts.add(add);
            }
            else if(in == 2){
                sort(0);
                printContacts();
            }
            // Sorting Options
            else if(in == 3){
                sort(1);
                printContacts();
            }
            else if(in == 4){
                sort(2);
                printContacts();
            }
            else if(in == 5){
                listStudents();
            }
            // Searching
            else if(in == 6) {
                System.out.println("Enter a first name");
                String fName = input.nextLine();
                if (searchFirstName(fName) == null) {
                    System.out.println(fName + " is not in the list");
                } else {
                    System.out.println(searchFirstName(fName));
                }
            }
            else if(in == 7) {
                System.out.println("Enter a last name");
                String lName = input.nextLine();
                if (searchLastName(lName) == null) {
                    System.out.println(lName + " is not in the list");
                } else {
                    System.out.println(searchLastName(lName));
                }
            }
            else if(in == 8){
                System.out.println("Enter a phone number");
                String number = input.nextLine();
                if (searchPhoneNumber(number) == null) {
                    System.out.println(number + " is not in the list");
                } else {
                    System.out.println(searchPhoneNumber(number));
                }
            }
      }
    }


    public static void main(String[] args) {
        // Test Code
        ArrayList<Person> s = new ArrayList<>();
        s.add(new Student("Sajeev", "Sa", "65019230293", 14));
        s.add(new Student("Vikram","Saluja","40810101029",10));
        s.add(new Student("Arjun","S","51019230192039",13));
        s.add(new Student("Zuck","Berg","666",100));
       ContactList a = new ContactList(s);
       a.run();
    }


}
