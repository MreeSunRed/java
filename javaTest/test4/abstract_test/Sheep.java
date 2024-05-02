package javaTest.test4.abstract_test;
public class Sheep extends Animal{
	public Sheep(String name,int age){
		super(name,age);
	}
	@Override
	public void eat(){
		System.out.println(this.getName()+"吃艹！");
	}
}