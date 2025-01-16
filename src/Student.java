public class Student extends Person{

    private int grade;

    public Student(String firstName, String lastName, String phoneNumber, int grade){
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }

    // Getter Methods
    public String getFirstName(){
        return super.getFirstName();
    }

    public String getLastName(){
        return super.getLastName();
    }

    public String getPhoneNumber(){
        return super.getPhoneNumber();
    }

    public int getGrade() {
        return grade;
    }

}
