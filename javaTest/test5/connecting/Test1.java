package javaTest.test5.connecting;
import java.net.*;
public class Test1{
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		InetAddress address =InetAddress.getByName("127.0.0.1");

		int port = 20000;
		byte[] bt = " Hello World".getBytes();
		DatagramPacket dp = new DatagramPacket(bt,bt.length,address,port);
		ds.send(dp) ;
		ds.close();
	}
}