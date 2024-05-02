package javaTest.test4.abstract_test;
public abstract class Animal{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void  setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this .age=age;	
	}
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void drink(){
		System.out.println("我会喝水！");	
	}
	public abstract void eat();
}