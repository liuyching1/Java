/***********
print:
1  5  2  8
8  5  9  22
3  7  7  17
12 17 18 47
*/
package top03;

import java.util.Random;

public class Ex091502 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int[][] ii = { { 1, 5, 2 }, { 8, 5, 9 }, { 3, 7, 7 } };
		int[] ySumi = new int[ii.length];
		System.out.println("\n\nii內容:");
		int xSumi = 0, ySum = 0, i, j;
		for (i = 0; i < ii.length; i++) {
			xSumi = 0;
			for (j = 0; j < ii[i].length; j++) {
				xSumi += ii[i][j];
				ySumi[i] += ii[j][i];
				System.out.print(ii[i][j] + "  ");

			}
			ySum += xSumi;
			System.out.print(xSumi);
			System.out.println();
		}
		for (int print : ySumi) {
			System.out.print(print + " ");
		}
		System.out.println(ySum);
		/*****/
		
		int[][] jj = new int[3][3];
		int x = 0, y = 0, num = 9;
		System.out.println("\n\njj內容:");
		for (x = 0; x < jj.length; x++) {
			for (y = 0; y < jj[x].length; y++) {
				jj[x][y] = (int) Math.floor(Math.random() * num + 1);
				System.out.print(jj[x][y] + " ");
			}
			System.out.println();
		}
	}

}
