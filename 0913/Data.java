package top03;

public class Data {
	/*----找關鍵字----*/
	boolean equalsStr(String[] Str, String keyword) {
		boolean isfalse = false;
		for (String sEx : Str) {
			if (sEx == keyword) {
				System.out.print("關鍵字:'" + keyword + "'已找到，");
				isfalse = true;
				System.out.print("結果為:");
				break;
			}
		}
		return isfalse;
	}
	/*----取最大值----*/
	int getmax(int[] numArr) {
		int max = 0;
		for (int num : numArr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	/*----取最小值----*/
	int getmin(int[] numArr) {
		int min = numArr[0];
		for (int num : numArr) {
			if (min > num) {
				min = num;
			}
		}
		return min;
	}

}
