package contactData;

public class Phone extends  ContactData {

    private String phoneNumber;

    public Phone (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getData(){
        return this.phoneNumber;
    }
}
