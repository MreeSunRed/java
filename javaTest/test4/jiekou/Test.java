
package javaTest.test4.jiekou;
public class Test{
	public static void main(String[] args){
		Frog f = new Frog("青蛙",18);
		Dog  d= new Dog("小狗",19);
		Rabbit r = new Rabbit("小兔", 20);
		f.swim();
		f.eat();
		d.swim();
		d.eat();
		r.eat();
	}
}