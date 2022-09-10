package top02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10相加總合:"+sum);
		sum=0; //歸零
		
		int n=1;
		while(n<=10) {
			sum+=n;
			n++;
		}
		System.out.println("1~10相加總合:"+sum);
		sum=0; //歸零
		
		n =1;
		do{
		sum+=n;
		n++;
		}while(n<=10);
		System.out.println("1~10相加總合:"+sum);
		sum=0; //歸零
		
		Data01 d01 = new Data01();
		int a=1,b=100,c=10;
		System.out.print("for迴圈...");
		System.out.print("\n1~100列出5的倍數:");
		d01.getnum();
		System.out.print("\n1~100列出"+c+"的倍數:");
		d01.getnum(c);
		System.out.print("\n"+a+"~"+b+"列出"+c+"的倍數:");
		d01.getnum(a,b,c);
		System.out.print("\nwhile迴圈...");
		System.out.print("\n10~100列出"+c+"的倍數:");
		d01.getwhilenum();
		
		/* static funtion */
		Data01.intsum(2,10);     
		
		/*- 猜亂數-*/
		double rNum =Math.floor(Math.random()*5+1);
		System.out.println("產生亂數:"+(int)rNum);
		
		Scanner  sc = new Scanner(System.in);	
		boolean trueOrfalse = false;
		int  myNum;
		
		while(!trueOrfalse) {
			
			myNum = sc.nextInt();
			trueOrfalse=d01.result(rNum,myNum);
			if(trueOrfalse) {
				System.out.println("亂數:"+(int)rNum+"你猜的數字"+myNum);
				System.out.println("你猜對了~Bye~");
				trueOrfalse=true;
				}
			else {
				System.out.println("亂數:"+(int)rNum+"你猜的數字"+myNum);
				trueOrfalse=false;
			}
			
		}

	
		int p=0;
		
		// print 01 11 12 23 35  58
		// print  1 2  3  5   8  13 
		/*
		for(int i=1,j=1;i<=10;i++) {
			System.out.print(p+i+" ");	
			p+=i;
			//n+=i;
			//System.out.print(n+" ");
		}	
		 */
	}

}

public class Data01 {
	void getnum() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0)
			System.out.print(i+" ");
		}
	}
	void getnum(int a) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%a==0)
			System.out.print(i+" ");
			}
		}
	void getnum(int begin,int end,int num) {
		int sum=0;
		for(int i=begin;i<=end;i++) {
			if(i%num==0)
			System.out.print(i+" ");
			}
		}
	void getwhilenum() {
		int sum=0;
		int i=1;
		while(i<=100) {
			if(i%10==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	
	static void intsum(int... num) {
		int sum=0;
		System.out.println();
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println("int...加總:"+sum);
	}

	boolean result(double rNum,int myNum) {
		if(myNum==rNum)
			return true;
		return false;
	}
}

