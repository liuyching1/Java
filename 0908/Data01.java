public class Data01 {
	void getnum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0)
				System.out.print(i + " ");
		}
	}

	void getnum(int a) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % a == 0)
				System.out.print(i + " ");
		}
	}

	void getnum(int begin, int end, int num) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % num == 0)
				System.out.print(i + " ");
		}
	}

	void getwhilenum() {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

	static void intsum(int... num) {
		int sum = 0;
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("int...加總:" + sum);
	}

	boolean result(double rNum, int myNum) {
		if (myNum == rNum)
			return true;
		return false;
	}
}
