package javaTest.test3.inherit;
public class Animal{
	int age;
	String name;
	String type;
	String food;
	public Animal(int age,String name,String type,String food){
		this.age=age;
		this.name=name;
		this.type=type;
		this.food=food;
	}
	public void eat(int times){
		System.out.println(name+ " like eat "+food+" "+times+"次！" );//用的是Animal（父类）的值
	}

}