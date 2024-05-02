package javaTest.test4.abstract_test;
public class Dog extends Animal{
	public Dog(String name,int age){
		super(name,age);
	}
	@Override
	public void eat() {
		System.out.println("我吃骨头！");
	}
	public void eat(String name){
		System.out.println("我吃骨头！"+name);
	}
}