package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        User user = null;
        try(FileInputStream fileInputStream = new FileInputStream("SerializationAndDeserializationFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            user = (User) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        finally {
            System.out.println("Deserializing User...");
            assert user != null;
            System.out.println("Name: "+user.getName());
            System.out.println("Age: "+user.getAge());
            System.out.println("Email: "+user.getEmail());
            System.out.println("Address: "+user.getAddress());
        }
    }
}
