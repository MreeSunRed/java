package javaTest.test4.jiekou;
public class Dog extends Animal implements Swim{
	public Dog(String name,int age){
		super(name,age);
	}
	@Override
	public void eat(){
		System.out.println("我吃骨头！");
	}
	@Override
	public void swim(){
		System.out.println("狗会狗刨");
	}
}