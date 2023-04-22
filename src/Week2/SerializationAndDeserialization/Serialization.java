package Week2.SerializationAndDeserialization;

import java.io.*;

public class Serialization {

    static void saveUser(User user, String filePath){
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in "+filePath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        User user = new User("Yash", "yash@example.com", "Bareilly", 23);
        Serialization.saveUser(user, "SerializationAndDeserializationFile.txt");
    }
}

