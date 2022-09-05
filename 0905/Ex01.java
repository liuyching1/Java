package top02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 65~90: 字元A~Z
		 * 97~122:字元a~z
		 * */
	
		char i=65; //A
		char c='A';
		
		i+=1; //i=(char)(i+1);
		System.out.println("i:"+i);
		c+=1; //c=(char)(c+1);
		System.out.println("c:"+c);
		
	//	float f= 3.14f;
		final double PI =3.14; //常數不可變
		System.out.println("PI:"+PI);
		System.out.println("100 mod 3 :"+100%3);
		int a=0,b=0;
		System.out.println(a++); //先印在加
		System.out.println(++a); //先加在印
		
		a=100;b=5;
		System.out.println((a%=b)==0); //是否整除
		System.out.println(a);
		
	}
}
