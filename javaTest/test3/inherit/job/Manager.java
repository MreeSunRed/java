package javaTest.test3.inherit.job;
public class Manager extends Employee{
	int bonus;
	Manager(int id,String name,int gongzi,int bonus){
		super(id,name,gongzi);
		this.bonus=bonus;
	}
	@Override
	public void work(){
		System.out.println("管理其他人");
	}
}