package javaTest.test5.Exception;
import java.util.*;
public class Test1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age=0;
		String name;
		System.out.println("请输入女友的名字");
		name=sc.next();
		System.out.println("请输入女友的年龄");
		age=sc.nextInt();
		Girl girl = new Girl();
		sc.close();
		try{
			girl.setAge(age);
			girl.setName(name);
		}catch(NumberFormatException e){
			System.out.println("年龄不符！");
		}catch(RuntimeException e){
			System.out.println("名字不不符！");	
		}
		System.out.println("挑选完成XD!");
		
	}
}

class Girl{
	private int age;
	private String name;
	public Girl(){};
	public Girl(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age<18||age>40){
			throw new NumberFormatException();
		}else{
			this.age=age;
		}
	}
	public void setName(String name){
		if(name.length()<3||name.length()>40){
			throw new RuntimeException();
		}else{
			this.name=name;
		}
	}
	
}