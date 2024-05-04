package javaTest.test5.io.zifu;

import java.io.FileReader;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("./javaTest/test5/io/zifu/aaa.txt");
        int a;
        char[] ch = new char[2];
        while ((a = fr.read(ch)) != -1) {
            System.out.print(new String(ch,0,a));
        }

    }
}
