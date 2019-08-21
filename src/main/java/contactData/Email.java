package contactData;

public class Email extends ContactData {

    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getData(){
        return this.emailAddress;
    }
}
