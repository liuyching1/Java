package top04;

public class ExtendsEx {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Num iarr = new Num();
		int n = 5;
		/*		
		iarr.setNum(19);
		iarr.serName("Mr.J");
		iarr.getNum();
		iarr.getName();
		System.out.println(iarr.getNum());
		System.out.println(iarr.getName());
		 */	
		
		System.out.println(iarr.m());
		System.out.println(iarr.m(n));
		System.out.println(iarr.m(8,2.5));
	}

}





////
public class Num {
	private int num;
	private String name;

	Num() {
		//this.name = "myname";
		//this.num = 19;
	}
	
	//多載Overload: 方法名稱可相同, 簽名須不同(參數個數,型別), 回傳值不影響
	int m() {
		return 0;
	}
	
	int m(int m) {
		return m;
	}
	
	double m(double m,double n) { 
		//隱含式轉換 傳入值若非double數字,則自動轉換double型別
		n+=m;
		return n;
	}
	
	//覆寫Override:
	
	/*
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setNum(int Num) {
		this.num = Num;
	}

	public void serName(String Name) {
		this.name = Name;
	}*/

}
