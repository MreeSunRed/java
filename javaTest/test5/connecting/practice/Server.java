package javaTest.test5.connecting.practice;
import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(10000);
		Socket socket = ss.accept();
		BufferedReader bfs = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		int a;
		while((a=bfs.read())!=-1){
			System.out.print((char)a);
		}
		bfs.close();
		socket.close();
		ss.close();
	}
}