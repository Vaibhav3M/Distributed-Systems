package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String args[]) throws Exception{

        //fetch registry
        Registry registry = LocateRegistry.getRegistry(2964);

        //fetch server from registry
        AddInterface obj = (AddInterface) registry.lookup("Addition");

        //now client can acccess server methods
        int n = obj.add(2,3);

        System.out.println("Addition value = " + n);
        System.out.println("");
    }
}
