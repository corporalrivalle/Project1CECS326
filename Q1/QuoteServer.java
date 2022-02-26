/**
 * Quote server listening to port 6017.
 *
 */
 
import java.net.*;
import java.io.*;

public class QuoteServer
{
  public static void main(String[] args) {
    String qotd = "Carpe Diem!"; /*Creates a quote of the day (qtod)*/
    try{
      ServerSocket sock = new ServerSocket(6018); /*Server turns on to listen to port 6018*/
      while(true){ /*will keep listening until a client connects*/
        Socket client = sock.accept(); /*accepts any request to connect on port 6018*/
        PrintWriter pout = new PrintWriter(client.getOutputStream(), true); /*Creates an object that gives the client a command*/
        pout.println(qotd); /*gives the qotd to the client*/
        client.close(); /*closes connection with client*/
      }
    }
    catch (IOException ioe) { /*Exception handling for In/Out Errors*/
      System.err.println(ioe);
    }
  }
}
