package UDP;

import java.io.IOException;
import java.net.*;

public class UDPClient {

    private static  String message = "Hello";


    public static void main(String args[]){

        DatagramSocket dataSocket = null;
        try{
            dataSocket = new DatagramSocket();
            //creating message
            byte[] m = message.getBytes();
            InetAddress hostAddress = InetAddress.getByName("localhost");
            int serverPort = 6789;

            DatagramPacket request = new DatagramPacket(m,m.length,hostAddress,serverPort);
            dataSocket.send(request);
           byte[] buffer = new byte[1000];
           DatagramPacket reply = new DatagramPacket(buffer,buffer.length);
           dataSocket.receive(reply);
           System.out.println("Reply received: " + new String(reply.getData())) ;

        } catch (SocketException e) {
            System.out.println(e.getLocalizedMessage());
        }
        catch (IOException e){
            System.out.println(e.getLocalizedMessage());

        }
        finally {
            if(dataSocket != null) dataSocket.close();
        }

    }

}
