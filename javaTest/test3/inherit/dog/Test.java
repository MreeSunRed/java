package javaTest.test3.inherit.dog;
public class Test{
	public static void main(String[] args){
		ChineseDog cd = new ChineseDog();
		Hasaki hs = new Hasaki();
		SBDog sb = new SBDog();
		cd.eat();
		cd.drink();
		cd.lookHome();
		hs.eat();
		hs.drink();
		hs.lookHome();
		sb.eat();
		sb.drink();
		sb.lookHome();
	}
}