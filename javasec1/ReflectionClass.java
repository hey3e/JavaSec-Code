package javasec1;

import java.io.IOException;
import java.io.Serializable;

public class ReflectionClass implements Serializable {
    static {
        System.out.println("[+] Static Constructor Method.");
    }

    public ReflectionClass() {
        System.out.println("[+] Constructor Method.");
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("[+] My readObject.");
    }
}
