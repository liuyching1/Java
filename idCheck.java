package kidcheck;

public class Idcheck {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Scanner sc = new Scanner(System.in);
		String kid = "a123456789";
		kid = kid.toUpperCase();
		
		char[] asc = new char[26];

		//存放26個英文字母
		for (int i = 0; i <= 25; i++) {
			asc[i] = (char) (65+i);
		}
		//
		int[] intArr = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30,
				31, 33 };
		//
		int index = 0, eng = 0;
		//拆解第一個字
		for (int i = 0; i < asc.length; i++) {
			if (kid.charAt(0) == asc[i]) {
				System.out.println(asc[i]);
				index = i;
				eng = intArr[index];
				break;
			}
		}
		int i0 = intArr[index] / 10;
		int i1 = intArr[index] % 10;
		
		
		
		
		//StringBuffer sb = new StringBuffer();
		
				char[] cid = new char[kid.length()];
		
		for (int i = 0; i < kid.length(); i++) {
			sb.append((char) (kid.charAt(i)));
		}
		// System.out.println(sb);




		}
		
	}


