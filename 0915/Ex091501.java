package top03;

import java.util.Arrays;

public class Ex091501 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int[] math = { 10, 90, 80, 100, 85, 60, 20 };
		System.out.println("數學成績小到大排序:");
		System.out.println(Arrays.toString(sortMath(math)));

		// int[][] ii1 = new int[2][2];
		int[][] ii = { { 5, 2 }, { 10, 8, 5, 9 }, { 11, 7, 6, 4, 1 } };
		System.out.println("ii資料長度:" + ii.length + "\n");
		System.out.println("ii內容:");
		for (int i = 0; i < ii.length; i++) {
			//
			for (int j = 0; j < ii[i].length; j++) {
				System.out.print(ii[i][j]);
				if (j != ii[i].length - 1) {
					System.out.print(", ");
				}
			}
			//
			System.out.println();
		}
	}
  
 static int[] sortMath(int[] math) {
		int temp = math[0]; // 假設最大值
		int[] sort = {};

		for (int i = 0; i < math.length; i++) {
			for (int j = i + 1; j < math.length; j++) {
				if (math[i] > math[j]) {
					temp = math[i];
					math[i] = math[j];
					math[j] = temp;
				}
			}
		}

		sort = math;
		return sort;
	} 
}

