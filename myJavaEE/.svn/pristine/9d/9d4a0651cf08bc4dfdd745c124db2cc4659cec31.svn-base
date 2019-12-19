package 高级应用.网络编程.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class SocketTest {
    public static void main(String[] args) throws UnknownHostException, IOException {
       
        while(true){
            Scanner scan=new Scanner(System.in);
            if(scan.hasNextLine()){
                
                Socket client=new Socket("192.168.1.24",8888);
                
                System.out.println( "LocalAddress:"+client.getLocalAddress());
                
                DataOutputStream out=new DataOutputStream( client.getOutputStream() ) ;
                out.writeUTF( scan.nextLine() );
                
                DataInputStream in=new DataInputStream(client.getInputStream());
                System.out.println(  in.readUTF() );
            }
            
        }
        
        
    }
}
