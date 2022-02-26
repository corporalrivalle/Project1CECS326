/**
 * Modified DateClient so that it requests a quote
 * from the quote server.
 */
 
import java.net.*;
import java.io.*;

public class QuoteClient
{
	public static void main(String[] args) {
		try{
			Socket sock = new Socket("127.0.0.1",6018); /*Creates a socket on port 6108, ip 127.0.0.1*/
			InputStream input = sock.getInputStream(); /*creates an input string*/
			BufferedReader bin = new BufferedReader(new InputStreamReader(input)); /*creates an output string*/
			String line;
			while ((line=bin.readLine()) !=null) {
				System.out.println(line); /*prints out any output that the server gives it*/
			}
			sock.close(); /*closes the socket*/
		} catch (IOException ioe) { /*Exception handling for In/Out Error*/
			System.err.println(ioe);
		}
	}
}

