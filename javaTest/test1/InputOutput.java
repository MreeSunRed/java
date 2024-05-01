package javaTest.test1;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = sc.nextInt();
        System.out.println("您输入了一个 "+s+" 字符串");
        System.out.println("转化为数字为 " + Integer.parseInt(s) + " ");
        System.out.println("您输入了一个 "+num+" 数字");
    }
}