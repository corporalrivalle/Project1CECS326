/*
 * An echo server listening on port 6017. 
 * This server reads information sent by the client and echoes it back. 
 */

import java.net.*;
import java.io.*;

public class  EchoServer
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Server Started!");
			// Declare server socket on port 6017
			ServerSocket sock = new ServerSocket(6017);

			// while loop to keep server running
			while (true)
			{
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
	
				// Display what the server has received
				System.out.println("Client has entered '" + serverEcho + "'");
	
				// Echo back what the server received (echo back client input to client)
				System.out.println("Echoing information recieved back to client...");
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
				pout.println("Server Echo: " + serverEcho);

					
				// close client connection
				System.out.println("Closing client connection and allowing for new one... \n");
				client.close();
			}
		}

		catch (IOException ioe) 
		{
			System.err.println(ioe);
		}
	}
}
