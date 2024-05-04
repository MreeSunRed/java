package javaTest.test5.connecting.practice;
import java.net.*;
import java.io.*;
public class Clinet{
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("127.0.0.1",10000);
		OutputStream os = socket.getOutputStream();
		os.write("你好世界\nHello World".getBytes());
		os.close();
		socket.close();
	}
}