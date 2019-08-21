package contactData;

import java.io.Serializable;

public class Address extends ContactData{

    private String streetName;
    private int streetNumber;

    public Address(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getData(){
        return this.streetName + " " + this.streetNumber;
    }
}
