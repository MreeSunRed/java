package javaTest.test5.io;
import java.io.*;
public class IOtest7 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("./javaTest/test5/io/ccc.gif");
		File f2 = new File("./javaTest/test5/io/1/aaa.gif");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
		byte[] bt = new byte[1024];
		int len;
		while((len=bis.read(bt))!=-1){
			bos.write(bt,0,len);
		}
		bis.close();
		bos.close();
    }
}
