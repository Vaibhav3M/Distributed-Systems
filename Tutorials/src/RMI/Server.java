package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String args[]) throws Exception{

        AddImpl obj = new AddImpl();
        Registry registry = LocateRegistry.createRegistry(2964);
        registry.bind("Addition",obj);

        System.out.println("Server started...");

    }
}
