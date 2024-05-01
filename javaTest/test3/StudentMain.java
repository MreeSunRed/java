package javaTest.test3;
public class StudentMain{
	public static void main(String[] args){
		Student.teacherName="Chen";
		Student student = new Student(18,true,"张三");
		Student student1 = new Student(19,false,"李四");
		String sex = student.getSex()?"男":"女";
		System.out.println("学生的名字是："+student.getName() +" 性别是 "+sex+" 年龄是 "+student.getAge()+"老师名字是 "+ student.getTeacher());
		String sex1 = student1.getSex()?"男":"女";
		System.out.println("学生的名字是："+student1.getName() +" 性别是 "+sex1+" 年龄是 "+student1.getAge()+"老师名字是 "+ student1.getTeacher());
	}
}