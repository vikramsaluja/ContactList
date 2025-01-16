import java.util.ArrayList;

public class ContactList {

    private ArrayList<Person> contacts;

    public ContactList(ArrayList<Person> contacts){
        this.contacts = new ArrayList<Person>();
        this.contacts = contacts;
    }

    public ArrayList<Person> getContacts(){
        return this.contacts;
    }

    public void addContact(Person person){
        contacts.add(person);
    }

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
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getPhoneNumber().equals(phoneNumber)){
                return contacts.get(i);
            }
        }
        return null;
    }

    // Print out Console
    public static void Console(){
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options\n");
        System.out.println("Menu:");
    }

    public static void main(String[] args) {

    }


}
