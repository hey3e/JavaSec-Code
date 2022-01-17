package javasec4;

import javasec3.Person;

import java.io.IOException;
import java.io.Serializable;

public class Student extends Person implements Serializable {
    private Integer grade;

    public Student(Integer age, Integer grade) {
        super(age);
        this.grade = grade;
    }

    public void readObject(java.io.ObjectInputStream s) throws IOException, ClassNotFoundException {
        System.out.println("[+] Student's readObject.");
    }
}
