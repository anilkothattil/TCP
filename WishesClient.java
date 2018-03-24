import java.net.*; 
import java.io.*;

class Client
{
   public static void main(String args[]) throws Exception
   {
     Socket sock = new Socket("localhost", 3333);
     DataInputStream din= new DataInputStream(s.getInputStream());
     DataOutputStream dout= new DataOutputStream(s.getOutputStream());
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Start Conversation");
     System.out.println("Type 'stop' to end the conversation");
    
     String str="",str2="";
     while(!str.equals("stop"))
     {
      str=br.readLine();
      dout.writeUTF(str);
      dout.flush();
      str2=din.readUTF();
      System.out.println("Server says: "+str2);
     }
     dout.close();
     sock.close();
  }
}
