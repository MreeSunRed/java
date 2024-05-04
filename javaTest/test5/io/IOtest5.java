package javaTest.test5.io;
import java.io.*;
public class IOtest5 {
	public static void main(String[] args) throws IOException {
		// File f1 = new File("./javaTest/test5/io/aaa.txt");
		// File f2 = new File("./javaTest/test5/io/bbb.txt");
		// FileInputStream fis=new FileInputStream(f1);
		// FileOutputStream fos = new FileOutputStream(f2);
		// int a;
		// while((a=fis.read())!=-1){
		// 	fos.write((char)a);
		// }	
		// fis.close();
		// fos.close();
	
		File f1 = new File("C:\\Users\\asus\\Desktop\\files\\UNIVERSITY\\Vue\\heima\\imgs\\2.gif");
		File f2 = new File("./javaTest/test5/io/bbb.gif");
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		int a;
		while((a=fis.read())!=-1){
			fos.write(a);
		}	
		fis.close();
		fos.close();
    }
}
