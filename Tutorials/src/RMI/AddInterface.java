package RMI;

import java.rmi.*;

/**
 * The interface Add interface.
 *
 * Remote interface implementation objects can be invoked remotely.
 *
 */
public interface AddInterface extends Remote{

    //Methods defined in this interface only can be invoked remotely
    public int add(int x, int y) throws RemoteException;

}
