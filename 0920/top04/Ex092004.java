package top04;

public class Ex092004 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i = 10, j = 0;
		int result = 0;
		/*
		 * try { System.out.println(i / j); // 編譯上不會出錯 } catch (Exception e) { // 父類別
		 * Exception 可以用 ArithmeticException 替代 System.out.println(e.toString()); }
		 * finally { System.out.println("must run"); }
		 */

		try {
			result = new Try().div(i, j);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
		}

	}

}

class Try {
	/**
	 * 
	 * @param i
	 * @param j
	 * @return
	 * @throws ArithmeticException
	 */
	int div(int i, int j) throws ArithmeticException {
		return i / j;
	}
}
