package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TextScramblerInterface extends Remote {

    public String testInputText(String inputText) throws RemoteException;
    public String reverse(String inputText) throws RemoteException;
    public String scramble(String inputText) throws RemoteException;
}
