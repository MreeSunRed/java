package javaTest.test4.abstract_test;
public class Student extends Person{
	public Student(String name,int age){
		super(name,age);
	}
	public Student(){}
	@Override
	public String work() {
		//System.out.println("学生要学习!");
		return "学生要学习!";
}
}