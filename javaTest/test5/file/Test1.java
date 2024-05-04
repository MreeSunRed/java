package javaTest.test5.file;
import java.io.*;
public class Test1{
	public static void main(String[] args) throws IOException{
		File f1 = new File("./javaTest/test5/file/a.txt");
		boolean a =f1.createNewFile();//创建文件
		System.out.println(a);
		
		File f2 = new File("./javaTest/test5/file/aaa");
		boolean b = f2.mkdirs();//创建多级
		System.out.println(b);


		File f3 = f1;
		boolean c =f3.delete();
		System.out.println(c);

		File f4 = f2;
		boolean d = f4.delete();//只能删空文件夹
		System.out.println(d);
	}
}