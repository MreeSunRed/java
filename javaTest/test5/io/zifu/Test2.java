package javaTest.test5.io.zifu;

import java.io.FileReader;
import java.io.FileWriter;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("./javaTest/test5/io/zifu/bbb.txt");
        fw.write(25105);
        fw.close();
    }
}
