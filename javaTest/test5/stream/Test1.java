package javaTest.test5.stream;
import java.util.*; 
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("张四");
        list1.add("张五");
        list1.add("李五");
        ArrayList<String> list2 = new ArrayList<>();
        for (String item : list1) {
            if (item.startsWith("张")) {
                list2.add(item);
            }
        }
        System.out.println(list2.get(0));
    }
}