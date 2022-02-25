/**
 * An echo client. The client enters data to the server, and the
 * server echoes the data back to the client.
 */
import java.net.*;
import java.io.*;

public class EchoClient
{
	public static void main(String[] args){
		try{
			Socket sock = new Socket("127.0.0.1",6018);
			InputStream input = sock.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(input));
			String line;
			while ((line=bin.readLine())!=null) {
				System.out.println("Hello there! I am the client.");
			}
			sock.close();
		} catch (IOException ioe){
			System.err.println(ioe);
		}
	}
}
