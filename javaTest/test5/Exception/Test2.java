package javaTest.test5.Exception;
import java.util.*;
public class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age=0;
		String name;
		Girl1 girl = new Girl1();
		while (true) {
			try {
				System.out.println("请输入女友的名字");
				name = sc.next();
				girl.setName(name);
				System.out.println("请输入女友的年龄");
				age = sc.nextInt();
				girl.setAge(age);
				break;
			} catch (AgeException e) {
				e.printStackTrace();
				continue;
			} catch (NameException e) {
				e.printStackTrace();
				continue;
			}
		}
		// System.out.println(girl);
		sc.close();
		System.out.println("挑选完成XD!");
		
	}
}

class Girl1{
	private int age;
	private String name;
	public Girl1(){};
	public Girl1(String name,int age){
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
			throw new AgeException("年龄有误！");
		}else{
			this.age=age;
		}
	}
	public void setName(String name){
		if(name.length()<3||name.length()>40){
			throw new NameException("名字有误！");
		}else{
			this.name=name;
		}
	}
	
}
class NameException extends RuntimeException{
	public NameException(){}
	public NameException(String msg){
		super(msg);
	}
}
class AgeException extends RuntimeException{
	public AgeException(){}
	public AgeException(String msg){
		super(msg);
	}
}