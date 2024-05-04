package javaTest.test5.io;
import java.io.*;
public class IOtest2 {
    public static void main(String[] args) throws IOException{
		File f1 = new File("./javaTest/test5/io/aaa.txt");
		FileOutputStream fos = new FileOutputStream(f1,true);//第二个参数设置成true就不会清空文件
		String str1 ="Hello";
		String str2 = "World";
		byte[] bt1 = str1.getBytes();
		fos.write(bt1);
		String str3 = "\r\n";
		byte[] bt2 = str3.getBytes();
		fos.write(bt2);
		byte[] bt3 = str2.getBytes();
		fos.write(bt3);
		fos.close();
    }
}
