/**
 * Quote server listening to port 6017.
 *
 */
 
import java.net.*;
import java.io.*;

public class QuoteServer
{
  public static void main(String[] args) {
    String qotd = "Carpe Diem!";
    try{
      ServerSocket sock = new ServerSocket(6018);
      while(true){
        Socket client = sock.accept();
        PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
        pout.println(qotd); /*The problem where it prints out the date*/
        client.close();
      }
    }
    catch (IOException ioe) {
      System.err.println(ioe);
    }
  }
}
