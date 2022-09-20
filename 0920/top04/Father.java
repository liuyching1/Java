package top04;

public class Father {
	public String age = "55";
	public String name = "FatherName";
	public String id = "Id .F";
	public String whoclass = "Father";

	Father() { // 預設建構子
		this.age = "54";
		this.name = "isJohn";
	}

	Father(String f) { // 自訂父類別建構子
        // this.age="54";
		// this.name="isJohn";
	}

	public void myname() {
		System.out.println(whoclass);
	}

}

//多載(Overload) : 方法名稱相同, 簽名不相同
//覆寫(Override) : 方法名稱相同, 簽名相同
class Child extends Father {

	public String deptName = "deptName"; // 部門名稱
	public String course = "course";
	public String whoclass = "Child";

	Child() { // 預設建構子

	}
	
	Child(String c) { // 自訂子類別建構子
		
	}
	public void myname() {
		System.out.println(whoclass);
	}

	/*
	 * 
	 * public void print() { System.out.println("部門是：" + deptName + "，任教科目：" +
	 * course); } public void mark() { System.out.println("列印學生的成績"); }
	 */
}

/*----------

public int fa() {
	return 1;
}

public int fa(int fa) {
	return fa;
}


public int fa() {
	return 2;
}

*/
