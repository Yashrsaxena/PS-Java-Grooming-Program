package SerializationAndDeserialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args){
        User user = new User("Yash", "yash@example.com", "Bareilly", 23);
        try(FileOutputStream fileOutputStream = new FileOutputStream("SerializationAndDeserializationFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in SerializationAndDeserializationFile.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
