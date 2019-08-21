import org.apache.commons.lang3.ArrayUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements Serializable {

    private List<Contact> contacts;

    public AddressBook(){
        this.contacts = new ArrayList<>();
    }

    public void add(Contact contact){
        if(find(contact.getName()) != null) {
            throw new IllegalArgumentException("There can't be to users with the same name in the AddressBook!!");
        }
       contacts.add(contact);
    }

    public Contact find(String name){
        for(Contact contact : contacts){
            if(contact.getName().equals(name)) { return contact; }
        }
        return null;
    }

    public boolean delete(String name){
        for(int i=0; i<contacts.size(); i++){
            if(contacts.get(i).getName().equals(name)){
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
