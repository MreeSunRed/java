package javaTest.test2;
public class Switch{
	public static void main(String[] args){
		int num = 9;
		String star = new String();
		switch(num){
			case 1:
				star="星期一";
				break;
			case 2:
				star="星期二";
				break;
			case 3:
				star = "星期三";
				break;
			case 4:
 				star= "星期四";
				break;
			case 5:
				star="星期五";
				break;
			case 6 :
				star="星期六";
				break;
			case 7:
				star="星期日";
				break;
			default:
				System.out.println("数据不合理");
                System.exit(0);
		}
	System.out.println("今天是"+star);
	}
}
