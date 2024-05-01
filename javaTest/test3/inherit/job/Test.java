package javaTest.test3.inherit.job;
public class Test{
	public static void main(String[] args){
		Manager mg = new Manager(01,"张三",666,888);//int id,String name,int gongzi
		Cooker ck   = new Cooker(02,"李四",111);
		mg.work();
		ck.work();
		System.out.println(mg.getGongzi()+mg.getName()+mg.getId());
	}
}