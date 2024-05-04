package javaTest.test5.file;
import java.io.*;
public class Test2{
	public static void main(String[] args){
		File f1 = new File("./javaTest/");
		File[] list = f1.listFiles();
		for(File f:list){
			System.out.println(f);
		}
	}
}