import contactData.Address;
import contactData.Email;
import contactData.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("0754867233");
        Email email = new Email("denisa.popan97@gmail.com");
        Address address = new Address("Lacramioarelor", 9);
        Phone phone2 = new Phone("0733188128");

        Contact firstContact = new Contact("Denisa");
        firstContact.addContactData(phone);
        firstContact.addContactData(email);
        firstContact.addContactData(address);

        Contact secondContact = new Contact("Tabita");
        secondContact.addContactData(phone2);

        AddressBook addressBook = new AddressBook();
        addressBook.add(firstContact);
        addressBook.add(secondContact);

        for(Contact contact: addressBook.getContacts()){
            System.out.println(contact.toString());
        }

        Storage storage = new Storage();
        storage.store(addressBook);

        AddressBook readAddressBook = storage.load();
        if(readAddressBook != null){
            for(Contact contact: readAddressBook.getContacts()){
                System.out.println(contact.toString());
            }
        }
        else{
            System.out.println("Something went wrong!");
        }
    }
}
