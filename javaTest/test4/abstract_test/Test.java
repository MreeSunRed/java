package javaTest.test4.abstract_test;
public class Test{
	public static void main(String[] args){
		Student s = new Student("张三",18);
		System.out.println(s.getName()+" 今年 "+s.getAge()+"岁  的工作是 "+s.work());//void 不行放进去！
	}
}