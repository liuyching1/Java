package top01;

public class CalcTax {
	void calc() { // 計算所得
		int salary = 30000;
		double rate = 0.06;
		double tax = salary * rate;
		System.out.println("稅率:" + rate + "\n薪資:" + salary + "\n所得:" + tax + "\n");
	}

	void calc01(int salary) {
		double rate = 0.06;
		double tax = salary * rate;
		System.out.println("稅率:" + rate + "\n薪資:" + salary + "\n所得:" + tax + "\n");
	}

	void calc02(int salary, double rate) {
		double tax = salary * rate;
		System.out.println("稅率:" + rate + "\n薪資:" + salary + "\n所得:" + tax + "\n");
	}

	double calc03(int salary, double rate) { // 傳回'double'型別資料
		double tax = salary * rate;
		return tax;
	}
}
