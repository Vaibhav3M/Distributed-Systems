package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


public class TCPServer {

    private static String messageFromClient = "";
    private static String responseFromServer = "";

    public static void main(String args[]) throws IOException {

        //Creating a socket to  agreed port
        ServerSocket serverSocket = new ServerSocket(5000);

        while(true){

            //Establish connection with client
            Socket connectionSocket = serverSocket.accept();

            //Input stream from client
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

            //Output stream to send values to client
            DataOutputStream toClient = new DataOutputStream(connectionSocket.getOutputStream());

            //Get input message from client and then print
            messageFromClient = fromClient.readLine();
            System.out.println("Client sent: " + messageFromClient);

            //Perform some action on string
            responseFromServer = new StringBuffer(messageFromClient).reverse().toString() + "\n";

            //Send the result to client
            toClient.writeBytes(responseFromServer);

        }
    }
}
