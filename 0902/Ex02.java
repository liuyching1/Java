package top01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Method01 m01 = new Method01();
		m01.calc();
		m01.calc01(35000); //傳值一個變數
		m01.calc02(40000, 0.1); //傳值兩個變數
		
		int s=40000;
		double r=0.1,t;		
		t = m01.calc03(s, r);  //接收回傳值
		System.out.println("(4)稅率:"+r+"\n薪資:"+s+"\n所得:"+t);
	}

}

/*-Method01.java-*/
public class Method01 {
	void calc() { //計算所得
		int salary=30000;
		double rate =0.06;
		double tax = salary*rate;
		System.out.println("(1)稅率:"+rate+"\n薪資:"+salary+"\n所得:"+tax);
	}
	
	void calc01(int salary) {
		double rate =0.06;
		double tax=salary*rate;
		System.out.println("(2)稅率:"+rate+"\n薪資:"+salary+"\n所得:"+tax);
	}
	
	void calc02(int salary,double rate) {
		double tax=salary*rate;
		System.out.println("(3)稅率:"+rate+"\n薪資:"+salary+"\n所得:"+tax);
	}
	
	double calc03(int salary,double rate) { //傳回'double'型別資料
		double tax=salary*rate;
		return tax;
	}
	
}
