import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main (String A[]) throws Exception
    {
        System.out.println("Client Application is Running..");

        Socket sobj = new  Socket("localhost",2100); // Client knocks on the server's port 2100 door. "localhost" means same computer.

        System.out.println("Connection is succesfull with server");

        PrintStream pobj = new PrintStream(sobj.getOutputStream()); //Sends message out (Output), बोलणारा

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream())); // Reads message from network (Input) ,ऐकणारा 

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in)); //Reads what you type (System.in) , input lihnara keyboard


        System.out.println("---------------------------------------------------------");
        System.out.println("----------------Marvellous Chat Client-------------------");
        System.out.println("---------------------------------------------------------");

        String str1 = null , str2 = null;

        System.out.println("Enter message for server : ");

        while (!(str1=bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says : "+str2);
            System.out.println("Enter message for server : ");
        }

        sobj.close();
    }
}
/*Client side:

1.User types "Hi" → bobj2.readLine() reads it from keyboard
2.pobj.println("Hi") → sends "Hi" to server
3.bobj1.readLine() → waits and reads server's reply
4.Prints: "Server says: Hello" */