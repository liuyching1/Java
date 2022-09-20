
package top02;

import java.util.Scanner;

public class Ex090502 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		System.out.println("6<<2: " + (6 << 2));
		// 6的2進制:00000110
		// '00001100' 6<<1 : 12
		// '00011000' 6<<2 : 24

		Data data = new Data();
		data.sum(80, 70, 60);

		// 自行輸入 國文,英文,數學 成績
		int chn, eng, math;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三科成績(國文,英文,數學):");
		chn = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		data.sum(chn, eng, math);
		data.print();

		int mile = 800;
		System.out.println("\n里程數:" + mile + " 車資:" + data.taxi(mile));
		mile = 2200;
		System.out.println("里程數:" + mile + " 車資:" + data.taxi(mile));
		
		// if多項式
		int score = 100;
		if (score >= 100) {
			System.out.println("成績滿分");
		} else if (score >= 90) {
			System.out.print("90>成績<100");
		} else if (score >= 80) {
			System.out.print("80>成績<90");
		} else if (score >= 70) {
			System.out.print("70>成績<80");
		} else if (score >= 60) {
			System.out.print("60>成績<70");
		} else
			System.out.println("分數為不及格");	
		
		//
		double sp = data.setPrice(1000);
		System.out.println("計算油價: "+sp);

		double tx = data.tax(400000);
		System.out.println("計算所得稅:"+tx);

		double money = data.setshop(2999);
		System.out.println("應付金額: "+money);

		int sum = 0;
		System.out.print("1~100,5的倍數有:" + sum);
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
				System.out.print(i + ",");
			}
		}
		System.out.println("\n5的倍數加總:" + sum);
	}
}
