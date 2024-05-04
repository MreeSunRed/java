package javaTest.test5.io.zifu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new FileReader("./javaTest/test5/io/zifu/aaa.txt"));
        // String line = bfr.readLine();
        BufferedWriter bfw = new BufferedWriter(new FileWriter("./javaTest/test5/io/zifu/ccc.txt"));
        // String line;
        // while ((line = bfr.readLine()) != null) {
        //     bfw.write(line);
        //     bfw.newLine();
        // }
        int a;
         while ((a = bfr.read()) != -1) {
            bfw.write((char)a);
        }
        bfw.write("aaaa");
        bfw.close();
        bfr.close();
    }
}
