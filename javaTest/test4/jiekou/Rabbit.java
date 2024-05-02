package javaTest.test4.jiekou;
public class Rabbit extends Animal{
	public Rabbit(String name,int age){
		super(name,age);
	}
	@Override
	public void eat(){
		System.out.println(this.getName()+"吃胡萝卜！");
	}
}