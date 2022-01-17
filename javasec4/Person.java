package javasec4;

import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable{
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void readObject(java.io.ObjectInputStream s) throws IOException, ClassNotFoundException {
        System.out.println("[+] Person's readObject.");
    }
}
