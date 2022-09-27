package kidcheck;

public class Idcheck {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Scanner sc = new Scanner(System.in);
		String kid = "a123456789";
		kid = kid.toUpperCase(); //
		char[] asc = new char[26];

		System.out.println(kid);
		for (int i = 0; i <= 25; i++) {
			asc[i] = (char) (65+i);
		}
		System.out.println(asc);
		//

		
		char[] cid = new char[kid.length()];

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < kid.length(); i++) {
			sb.append((char) (kid.charAt(i)));
		}
		// System.out.println(sb);

		// A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
		char[] intArr = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32,
				30, 31, 33 };


		}
		
	}


