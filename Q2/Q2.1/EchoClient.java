/*
 * An echo client on port 6017. 
 * The client enters data which is sent to the server.
 * The client then receives an echo of the data from the server.
 */

import java.net.*;
import java.io.*;

public class EchoClient
{
	public static void main(String[] args) 
	{
		try
		{
			Socket sock = new Socket("localhost", 6017);
			System.out.println("Connected to server!");

			// Take the system.in data (user keyboard input)
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter an input to send to server: ");

			// Send user input to server
			PrintWriter pout = new PrintWriter(sock.getOutputStream(), true);
			pout.println(userInput.readLine());

			// Retreive server echo
			BufferedReader bin = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			System.out.println(bin.readLine());
		} 

		catch (IOException ioe) 
		{
			System.out.println("--- Server connection request failed. Please try again. (" + ioe + ") ---");
		}
	}
}
