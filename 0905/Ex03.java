package top02;

public class Ex03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		//if多項式
		int score =100;
		if(score>=100) {
			System.out.println("滿分");		
		}else if(score >=90) {
			System.out.print("90>成績<100");
		}else if(score >=80) {
			System.out.print("80>成績<90");
		}else if(score >=70) {
			System.out.print("70>成績<80");
		}else if(score >=60) {
			System.out.print("60>成績<70");
		}else System.out.println("分數為不及格"); 

		/*99乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"x"+j+"="+i*j+" ");	
			}
			System.out.println("");
		}*/
		
	}

}
