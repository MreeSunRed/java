package javaTest.test4.abstract_test;
public abstract class Person{
	private String name;
	private int age;
	public Person(){}//要大写
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public abstract String work();//返回类型不要忘记
}