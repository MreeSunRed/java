package javaTest.test5.stream;
import java.util.*;
public class Test2{
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<>();
		Collections.addAll(list1,"a","b","c","d");
		list1.stream().forEach(s->System.out.println(s)); 	
		int[] arr = {1,3,2,5,4,5,6,8};
		Arrays.stream(arr).forEach(s->System.out.println(s));//数组对象
	}
}