package javaTest.test4.abstract_test;
public class Test2{
	public static void main(String[] args){
		Frog f = new Frog("青蛙",18);
		Dog  d= new Dog("小狗",19);
		Sheep s = new Sheep("小羊", 20);
		Animal a = new Sheep("小羊", 20);
		f.drink();
		f.eat();
		d.drink();
		d.eat();
		s.drink();
		s.eat();
		//a.work();父类没这个方法
	}
}