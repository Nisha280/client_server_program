import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
 public class Client 
{
public static void main(String[] args) throws Exception
{
Socket c_socket = new Socket("127.0.0.1",8000);
System.out.println("connection requested");
DataInputStream in = new DataInputStream (c_socket.getInputStream());
DataOutputStream out = new DataOutputStream (c_socket.getOutputStream());
out.writeUTF("hi server !send me todays date");
System.out.println("service requested");
System.out.println("server message:" + in.readUTF());
c_socket.close();
in.close();
out.close();
}
} 