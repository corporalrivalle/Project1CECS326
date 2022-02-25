/**
 * An echo server listening on port 6007. This server reads from the client
 * and echoes back the result. 
 */

import java.net.*;
import java.io.*;

public class  EchoServer
{
    public static void main(String[] args){
        try{
            ServerSocket sock = new ServerSocket(6018);
            Socket client = sock.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String in; 
            while((in = input.readLine())!=null){
                out.println(in);
            }

        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
