import java.io.*; //BufferedReader
import java.net.*; //ServerSocket

class ChatServer
{
    public static void main (String A[]) throws Exception
    {
        System.out.println("Server Application is Running..");

        ServerSocket ssobj = new ServerSocket(2100);//Server opens port 2100 and waits. Port is like a door number.

        System.out.println("Server is waiting at port 2100");

        Socket sobj = ssobj.accept(); //Server accepts the client's request. Now a connection is established — both sides have a Socket object.
        
        System.out.println("Client request gets accepted succesfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream()); //Sends message out (Output), बोलणारा

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream())); // Reads message from network (Input) ,ऐकणारा 

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in)); // Reads what you type (System.in) , input lihnara keyboard

        System.out.println("---------------------------------------------------------");
        System.out.println("----------------Marvellous Chat Server-------------------");
        System.out.println("---------------------------------------------------------");

        String str1 = null , str2 = null;

        while((str1 = bobj1.readLine())!=null)     //aikna
        {
            System.out.println("Client says : "+str1);
            System.out.println("Enter message for Client : ");
            str2 = bobj2.readLine();
            pobj.println(str2);     //bolna
        }

        sobj.close();
        ssobj.close();

    }
}
/*Server side:

1.bobj1.readLine() → receives "Hi" from client
2.Prints: "Client says: Hi"
3.User types "Hello" → bobj2.readLine() reads from keyboard
4.pobj.println("Hello") → sends "Hello" back to client

 */