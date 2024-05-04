package javaTest.test5.Exception;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo1 {
    public static void main(String[] args) throws Exception {
        //编译时的异常
        // String time = "2023年1月1日";
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年xx月xx日");
        // Date date = sdf.parse(time);
        // System.out.println(date);
   
        //运行时的异常
        int[] arr = { 1, 2, 3 };
        System.out.println(arr[66]);
    }

}
