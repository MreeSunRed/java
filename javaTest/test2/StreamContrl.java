package javaTest.test2;
public class StreamContrl{
	public static void main(String[] args){
	int x=75;
	double y;
	if(x>=90){
	y=5;}
	else if(x<60){
	y=2.5;}
	else{
	y=0;
}
System.out.println("y的值为： "+y);
 int z = y>2.5?0:1;
System.out.println(z);
}
}
