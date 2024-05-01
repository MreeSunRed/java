package javaTest.test3.inherit.job;
public class Cooker extends Employee{
	public Cooker(int id,String name,int gongzi){
		super(id,name,gongzi);
	}
	@Override
	public void work(){
		System.out.println("炒菜");
	}
}