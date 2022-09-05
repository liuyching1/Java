package top01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Calc cc = new Calc();
		Scanner sc =new Scanner(System.in);
		double a,b,rt;
		System.out.print("輸入a值:");
		a=sc.nextDouble();
		System.out.print("輸入b值:");
		b=sc.nextDouble();
		System.out.println("四則運算\na:"+a+" b:"+b+"");
		rt=cc.plus(a, b);
		System.out.println("a加b:"+rt);
		rt=cc.sub(a, b);
		System.out.println("a減b:"+rt);
		rt=cc.mult(a, b);
		System.out.println("a乘b:"+rt);
		rt=cc.div(a, b);
		System.out.println("a除b:"+rt);
		rt=cc.per(a, b);
		System.out.println("a除b取餘:"+rt);		
	}
}

public class Calc {
	double result;
	double plus(double a,double b){
		result =a+b;
		return result;
	}
	
	double sub(double a,double b) {
		result =a-b;
		return result ;
	}
	
	double mult(double a,double b) {
		result =a*b;
		return result;
	}
	
	double div(double a,double b) {
		result =a/b;
		return result;
	}
	
