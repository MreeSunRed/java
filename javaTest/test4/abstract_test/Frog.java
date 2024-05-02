package javaTest.test4.abstract_test;
public class Frog extends Animal{
	public Frog(String name,int age){
		super(name,age);
	}
	@Override
	public void eat(){
		System.out.println("我吃虫子！");
	}
}