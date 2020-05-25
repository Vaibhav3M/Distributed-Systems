package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;

public class TCPClient {

    private static String clientMessage = "";
    private static String serverResponseMessage = "";


    public static void main(String args[]) throws Exception{

        //Create a socket
        Socket clientSocket = new Socket("localhost",5000);

        //Output stream at client to send values to server
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        //Input at client to get values from server
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //Get input from user - in console
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        clientMessage = inFromUser.readLine();

        //send message from user to the server
        outToServer.writeBytes(clientMessage + "\n");

        serverResponseMessage = inFromServer.readLine();
        System.out.println("SERVER response : " + serverResponseMessage);

        clientSocket.close();

    }
}
