package javaTest.test5.io;
import java.io.*;
public class IOtest4 {
    public static void main(String[] args) throws IOException{
		File f1 = new File("./javaTest/test5/io/aaa.txt");
		FileInputStream fis = new FileInputStream(f1);
		int a;
		while ((a = fis.read()) != -1) {
			System.out.print((char) a);
		}
		fis.close();
    }
}
