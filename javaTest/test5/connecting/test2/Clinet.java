package javaTest.test5.connecting.test2;
import java.net.*;
import java.io.*;
public class Clinet{
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("127.0.0.1",10000);
		OutputStream os =socket.getOutputStream();
		os.write("Hello World\n你好你好".getBytes());
		socket.close();
		os.close();
	}
}