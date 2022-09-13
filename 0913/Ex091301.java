package top03;

public class Ex091301 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int[] a = new int[6];
		//int[] math2 = new int[] { 59, 75, 80, 93, 100, 66 }; 
		int[] math = { 59, 75, 80, 93, 100, 66 };
		int[] score;
		/*----length使用----*/
		System.out.println("length使用:");
		for (int i = 0; i < math.length; i++) {
			System.out.print(math[i] + " ");
		}
		/*----Stack, Heap概念----*/
		System.out.println("\nStack, Heap概念:");
		a = math; // 共享Heap空間(Address)
		a[0] = 85;
		for (int j = 0; j < math.length; j++) {
			System.out.print(math[j] + " ");
		}
		/*----math[index]使用----*/
		System.out.println("\nmath[index]使用:");
		int index = 6; // math[index] ==index
		for (int j = 0; j < index; j++) {
			System.out.print(math[j] + " ");
		}
		/*----for each使用----*/
		System.out.println("\nfor each使用:	");
		for (int i : math) {
			System.out.print(i + " ");
		}
		/*----陣列內容複製----*/
		System.out.println("\nscore[]:");
		score = math.clone(); // 陣列內容複製
		score[0] = 59;
		for (int i : score) {
			System.out.print(i + " ");
		}
		System.out.println("\nmath[]:");
		for (int i : math) {
			System.out.print(i + " ");
		}
	}
}
