import java.net.*; 
import java.io.OutputStream;

class WishesClient
{
   public static void main(String args[]) throws Exception
   {
     Socket sock = new Socket("localhost", 3333);
     DataInputStream din= new DataInputStream(s.getInputStream());
     DataOutputStream dout= new DataOutputStream(s.getOutputStream());
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  }
}
