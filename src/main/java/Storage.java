import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Storage {

    public boolean store(AddressBook addressBook) {
        try (FileOutputStream streamOut = new FileOutputStream("AdressStorage.txt", false);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(streamOut)) {
            objectOutputStream.writeObject(addressBook);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public AddressBook load(){
        try (FileInputStream streamIn = new FileInputStream("AdressStorage.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(streamIn)) {
            return (AddressBook) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
