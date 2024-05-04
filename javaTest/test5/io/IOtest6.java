package javaTest.test5.io;
import java.io.*;
public class IOtest6 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\asus\\Desktop\\files\\UNIVERSITY\\Vue\\heima\\imgs\\2.gif");
		File f2 = new File("./javaTest/test5/io/ccc.gif");
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		byte[] bt = new byte[1024];
		int len;//限制最后一次
		while(((len=fis.read(bt))!=-1)){
			fos.write(bt,0,len);
		}
		fis.close();	
		fos.close();
    }
}
