package top03;

import java.util.Scanner;

public class Ex092002 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		boolean noAns = false;
		GuessNum guNum = new GuessNum();
		guNum.setAns();
		System.out.println(guNum.guess(5));
	}

}

class GuessNum {
	private int ans;

	public int getAns() {
		return ans;
	}

	public void setAns() {
		this.ans = (int) Math.floor(Math.random() * 10 + 1);
	}

	public String guess(int myAns) {
		String result = "";
		if (ans > myAns) {
			result = "答案是:" + ans + ", 你的答案是:" + myAns + ", 你猜太小了!";
		} else if (ans < myAns) {
			result = "答案是:" + ans + ", 你的答案是:" + myAns + ", 你猜太大了!";
		} else {
			result = "答案是:" + ans + ", 你猜對了!";
		}
		return result;
	}
}
