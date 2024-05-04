package javaTest.test5.io;
import java.io.*;
public class IOtest {
    public static void main(String[] args) throws IOException{
		File f1 = new File("./javaTest/test5/io/aaa.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(99);//写入ascll码	
        fos.close();
    }
}
