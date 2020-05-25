package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements AddInterface {

    //UnicastRemoteObject : Used for exporting a remote object with JRMP(Java Remote Method Protocol) and obtaining a stub that communicates to the remote object.
    protected AddImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
