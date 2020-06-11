package UDP;

import java.io.IOException;
import java.net.*;

public class UDPServer {


    public static void main(String args[]) {

        DatagramSocket dataSocket = null;

        try {
            //creating a socket at port which is known by client
            dataSocket = new DatagramSocket(6789);
            byte[] buffer = new byte[1000];

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                dataSocket.receive(request);
                DatagramPacket reply = new DatagramPacket(request.getData(), request.getLength(), request.getAddress(), request.getPort());
                System.out.println(new String(request.getData()));
                dataSocket.send(reply);
            }
        } catch (SocketException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            if (dataSocket != null) dataSocket.close();
        }

    }

}
