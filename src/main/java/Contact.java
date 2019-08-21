import contactData.ContactData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {

    private String name;
    private List<ContactData> data;

    public Contact(String name){
        this.name = name;
        this.data = new ArrayList<>();
    }

    public void addContactData(ContactData contactData){
        data.add(contactData);
}

    public String getName(){
        return this.name;
    }

    public String toString(){
        String info = "Name: "+name+" Info: ";
        for(ContactData contactData : data){
            info = info + contactData.getData()+ " ";
        }
        return info;
    }
}
