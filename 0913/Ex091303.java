package top03;

public class Ex091303 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("99乘法表...for迴圈");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j + " ");
				if (i * j < 10) { //加強排版
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n99乘法表...while迴圈");
		int i = 1, j;
		while (i <= 9) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "x" + j + "=" + i * j + " ");
				if (i * j < 10) { //加強排版
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
