package 高级应用.网络编程.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest extends Thread{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        while(true){
            Socket socket=serverSocket.accept();
            DataInputStream in=new DataInputStream( socket.getInputStream() );
            String msg=in.readUTF();
            System.out.println( "来自远程连接的信息"+msg);
            DataOutputStream out=new DataOutputStream( socket.getOutputStream() );
            out.writeUTF( "我是服务端,已经接收到了你的信息："+msg);
            socket.close();
        }
    }
}
