package top02;

public class Data {
	int chn, eng, math;
	int sum;

	void sum(int a, int b, int c) {
		chn = a;
		eng = b;
		math = c;
	}

	int total() {
		return chn + eng + math;
	}

	double avg() {
		return total() / 3;
	}

	void print() {
		System.out.println("國文:" + chn);
		System.out.println("英文:" + eng);
		System.out.println("數學:" + math);
		System.out.println("總分:" + total());
		System.out.println("平均:" + avg());
	}

//
	int taxi(int mile) {
		int money = ((mile - 1000) / 300) * 10 + 80;
		return mile < 1000 ? 80 : money;
	}

//
	double setPrice(int price) {
		if (price > 1000) {
			price *= 0.8;
		}
		return price;
	}

	double tax(int income) {
		double total = 0;
		if (income <= 300000) {
			total = income * 0.06;
		} else if (income > 300000) {
			total = income * 0.06 + (income % 300000) * 0.13;
		}
		return total;
	}

	double setshop(int price) {
		if (price > 5000) {
			price *= 0.7;
		} else if (price >= 4000) {
			price *= 0.8;
		} else if (price >= 3000) {
			price *= 0.9;
		}
		return price;
	}

}
