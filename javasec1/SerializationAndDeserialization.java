package javasec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {
    public static void main(String[] args) throws Exception{
//        String string1 = "test";
//
//        FileOutputStream fileOutputStream = new FileOutputStream("test.db");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(string1);
//        objectOutputStream.close();
//
//        FileInputStream fileInputStream = new FileInputStream("test.db");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        String string2 = (String) objectInputStream.readObject();
//        System.out.println(string2);
//        objectInputStream.close();

//        Evil evil = new Evil();
//
//        FileOutputStream fileOutputStream = new FileOutputStream("evil.db");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(reflectionClass);
//        objectOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("evil.db");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        Evil object = (Evil) objectInputStream.readObject();
//        objectInputStream.close();

        ReflectionClass reflectionClass = new ReflectionClass();

        FileOutputStream fileOutputStream = new FileOutputStream("util.db");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(reflectionClass);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("util.db");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ReflectionClass object = (ReflectionClass) objectInputStream.readObject();
        objectInputStream.close();
    }
}
