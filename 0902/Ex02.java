package top01;

public class Ex090202 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CalcTax ct01 = new CalcTax();
		ct01.calc();
		ct01.calc01(35000); // 傳值一個變數
		ct01.calc02(40000, 0.1); // 傳值兩個變數

		int s = 40000;
		double r = 0.1, t;
		t = ct01.calc03(s, r); // 接收回傳值
		System.out.println("稅率:" + r + "\n薪資:" + s + "\n所得:" + t);
	}
}


/*-CalcTax.java-*/
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
