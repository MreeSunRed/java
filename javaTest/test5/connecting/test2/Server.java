package javaTest.test5.connecting.test2;
import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(10000);
		Socket socket =ss.accept();//返回一个socket对象
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bfs = new BufferedReader(isr);
		int s ;
		while ((s = bfs.read()) != -1) {
			System.out.print((char) s);
		}
		ss.close();
		socket.close();
		is.close();
	}
}