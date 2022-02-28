/**
 * An echo server listening on port 6007. This server reads from the client
 * and echoes back the result. 
 */

import java.net.*;
import java.io.*;

public class  EchoServer
{
    public static void main(String[] args) 
    {
            System.out.println("Server Started!");
            try
            {
                // Declare server socket on port 6017
                ServerSocket sock = new ServerSocket(6018);
    
                // Wait for the clien to connect to the server
                System.out.println("Waiting for client...");
                Socket client = sock.accept();
    
                // Display confirmation of client connection
                System.out.println("Client connected!");
    
                // Wait for client input to echo
                System.out.println("Waiting for client input...");
    
                // get the client input (keyboard input from client saved into input stream system.in)
                BufferedReader bin = new BufferedReader(new InputStreamReader(client.getInputStream()));
    
                // save information as a string (serverEcho) so any information can be displayed (numbers conflict with string concatenation)
                String serverEcho = bin.readLine();
                String clientEcho ="";

                //Changes output to correctly identify server/client. If no server/client info is given, an error message is returned instead.
                if (serverEcho.contains("client")){
                    clientEcho = "Hi! I am the server!";
                } else {
                    clientEcho = serverEcho;
                }
    
                // Display what the server has received
                System.out.println("Client has entered '" + serverEcho + "'");
    
                // Echo back what the server received (echo back client input to client)
                System.out.println("Echoing information recieved back to client...");
                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
                pout.println("Server Echo: " + clientEcho);

                System.out.println("Terminating Connection...");
            }
            catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
    }
