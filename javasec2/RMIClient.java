package javasec2;

import javax.naming.Context;
import javax.naming.InitialContext;

public class RMIClient {
    public static void main(String[] args) throws Exception{
        Context ctx = new InitialContext();
        ctx.lookup("rmi://127.0.0.1:1099/Target");
    }
}
