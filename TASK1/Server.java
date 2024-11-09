import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
public class Server{
public static void main(String[] args)throws Exception{
ServerSocket s_socket=new ServerSocket(8000);
System.out.println("waiting for client connection");
Socket s=s_socket.accept();
System.out.println("client connection");
DataInputStream in=new DataInputStream (s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
System.out.println("client message:"+in.readUTF());
Calendar obj=Calendar.getInstance();
String date=obj.get(Calendar.DATE)+"/"+(obj.get(Calendar.MONTH)+1)+ "/" + obj.get(Calendar.YEAR);
out.writeUTF("hi clara\n today's date is_"+date);
s.close();
s_socket.close();
in.close();
out.close();
}
}