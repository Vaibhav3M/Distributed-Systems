package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TextScramblerServer extends UnicastRemoteObject implements TextScramblerInterface {

    public TextScramblerServer() throws Exception{
        super();
    }


    public static void main(String args[]) throws Exception{

        TextScramblerServer textScramblerServer = new TextScramblerServer();
        Registry registry = LocateRegistry.createRegistry(1000);
        registry.bind("Scrambler",textScramblerServer);

        System.out.println("Scrambler Server started....");


    }


    @Override //Return input text as-is.
    public String testInputText(String inputText) throws RemoteException {

        return "Your input text is: " + inputText;
    }

    @Override //Return the string reversed.
    public String reverse(String inputText) throws RemoteException{
        String reversedInput = "";
        for(int i=0; i<inputText.length();i++)
        {
            reversedInput=reversedInput+inputText.charAt((inputText.length()-1)-i);
        }
        return "Result: "+reversedInput;
    }

    @Override //Return the string scrambled.
    public String scramble(String inputText) throws RemoteException{
        String scrambledInput="";

        for(int i=0; i<inputText.length();i++)
        {
            if(i%2==0)
            {
                scrambledInput=scrambledInput+inputText.charAt(i);
            }
            else
            {
                scrambledInput=inputText.charAt(i)+scrambledInput;
            }
        }
        return "Result: "+scrambledInput;
    }
}
