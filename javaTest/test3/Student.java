package javaTest.test3;
public class Student{
	private int age;
	private boolean sex;
	static String teacherName;//看是否共享,不属于对象而属于类，优先于对象存在
	private String name;
	public Student(int age,boolean sex , String name){
		this.age=age;
		this.sex=sex;
		this.name=name;
	}
	public int getAge(){
		return age;
	}	
	public boolean getSex(){
		return sex;
	}
	public String getName(){
		return name;
	}
	public String getTeacher(){
		return teacherName;
	}

}