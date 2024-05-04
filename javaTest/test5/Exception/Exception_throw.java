package javaTest.test5.Exception;
public class Exception_throw{
	public static void main(String[] args){
		int[] arr = null;
		int max = 0;
		try{
		max = getMax(arr);
		}catch(Exception e){
			System.out.println("捕获到异常啦哈哈");
		}
		System.out.println(max);

	}
	public static int getMax(int[] arr){
		if(arr==null){
			throw new NullPointerException();//要指出异常类型
		}else{
			return 6;
		}
	}
}