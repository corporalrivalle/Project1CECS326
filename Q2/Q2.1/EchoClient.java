/**
 * An echo client. The client enters data to the server, and the
 * server echoes the data back to the client.
 */
import java.net.*;
import java.io.*;

public class EchoClient
{
	public static void main(String[] args) {
		try{
			Socket sock = new Socket("localhost", 6018);
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

		} catch (IOException ioe) {
			System.out.println("--- Server connection request failed. Please try again. (" + ioe + ") ---");
		}
	}
}
