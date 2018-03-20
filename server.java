import java.net.*;            
import java.io.InputStream;
import java.io.DataInputStream;
public class WishesServer
{
   public static void main(String args[]) throws Exception
   {
     ServerSocket sersock = new ServerSocket(5000); 
     System.out.println("server is ready");  //  message to know the server is running
 
     Socket sock = sersock.accept();               
