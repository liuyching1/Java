/***********
print:
1  5  2  8
8  5  9  22
3  7  7  17
12 17 18 47
*/
package top03;

public class Ex091502 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int[][] ii = { { 1, 5, 2 }, { 8, 5, 9 }, { 3, 7, 7 } };
		int[] ySumi = new int[ii.length];
		System.out.println("ii內容:");
		int xSum = 0, ySum = 0, i, j;
		for (i = 0; i < ii.length; i++) {
			xSum = 0;
			for (j = 0; j < ii[i].length; j++) {
				xSum += ii[i][j];
				ySumi[i] += ii[j][i];
				System.out.print(ii[i][j] + "  ");

			}
			ySum += xSum;
			System.out.print(xSum);
			System.out.println();
		}
		for (int print : ySumi) {
			System.out.print(print + " ");
		}
		System.out.println(ySum);
	}

}
