package kidcheck;

import java.util.Scanner;

public class Idcheck {

	public static void main(String[] args) {
// TODO 自動產生的方法 Stub

		// Scanner sc = new Scanner(System.in);
		String kid = "a123456789";
		// 無論如何轉大寫
		kid = kid.toUpperCase();

		char[] asc = new char[26]; // 存放字母A-Z
		for (int i = 0; i <= 25; i++) {
			asc[i] = (char) (65 + i);
		}
		// 設定字母代表字元
		int[] intChar = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30,
				31, 33 };
		int[] intid= {};
		//
		int index = 0, eng = 0;
		// 拆解第一個字
		
		for (int i = 0; i < asc.length; i++) {
			if (kid.charAt(0) == asc[i]) {
				System.out.println(asc[i]);
				index = i;
				eng = intChar[index];
			}

		}
		// 將字元拆解顯示 十位數,個位數
		int i0 = eng / 10;
		int i1 = eng % 10;

		// 設定檢查碼checkCode
		int checkCode = kid.charAt(kid.length() - 1);
		System.out.println((char) checkCode);

		//
		int result;

		//

	}

}
