package week2.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    //Deserializing method Load User that can be used to load user from the already existing file where the user data is saved
    static void loadUser(String filePath) throws IOException, ClassNotFoundException{
        User user = null;
        try(FileInputStream fileInputStream = new FileInputStream(filePath); //Opening file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){ // Giving the file to object input stream
            user = (User) objectInputStream.readObject(); //reading object
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
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        loadUser("SerializationAndDeserializationFile.txt"); //loadUser method call
    }
}
