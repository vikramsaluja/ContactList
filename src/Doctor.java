public class Doctor extends Person{

    private int livesSaved;

    public Doctor(String firstName, String lastName, String phoneNumber, int livesSaved){
        super(firstName, lastName, phoneNumber);
        this.livesSaved = livesSaved;
    }

    public int getLivesSaved(){
        return this.livesSaved;
    }


}
