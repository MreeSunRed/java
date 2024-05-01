package javaTest.test2;
public class Circulate{
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			System.out.println("我错了 "+i+" 次！");
		}
		System.out.println("====================");
		int i=0;
		while(i<100){
			if(i%2==0){i++;continue;}
			System.out.println("我错了 while"+ i +" 奇数次!");
			i++;
		}
		i=0;
		System.out.println("====================");
		do{
			if(i%2==1) {i++;continue;}
			System.out.println("我错了dowhile"+i+" 偶数次！");
			i++;
		}while(i<100);
	}
}