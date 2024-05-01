package javaTest.test3.inherit.job;
public class Employee{
	private int id;
	private String name;
	private int gongzi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGongzi() {
		return gongzi;
	}

	public void setGongzi(int gongzi) {
		this.gongzi = gongzi;
	}
	Employee(int id,String name,int gongzi){
		this.id=id;
		this.name=name;
		this.gongzi=gongzi;
	}
	public void work(){
		System.out.println("工作~~~~");
}
}