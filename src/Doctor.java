public class Doctor extends Person{

    private String livesSaved;

    public Doctor(String firstName, String lastName, String phoneNumber, String livesSaved){
        super(firstName, lastName, phoneNumber);
        this.livesSaved = livesSaved;
    }

    public String getLivesSaved(){
        return this.livesSaved;
    }


}
