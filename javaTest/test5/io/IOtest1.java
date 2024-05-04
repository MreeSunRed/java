package javaTest.test5.io;
import java.io.*;
public class IOtest1 {
    public static void main(String[] args) throws IOException{
		File f1 = new File("./javaTest/test5/io/aaa.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		byte[] bt = {97,98,99,100};
		fos.write(bt,1,3);
		fos.close();
    }
}
