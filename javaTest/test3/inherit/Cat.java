package javaTest.test3.inherit;
public class Cat extends Animal{
	// int age = 10;
	// String name="小猫";
	// String type="CAT";
	// String food = "fish";
	// public Cat(){}
	public Cat(int age,String name,String type,String food) {//构造赋初值会报错
		super(age,name,type,food);//
	}
	//@Override
	//public void eat(int time){//名称，形参列表必须和父类一致(形参名字可以不同)
	//	System.out.println("小猫爱吃 "+food+" "+time+"次！");
	//}
}