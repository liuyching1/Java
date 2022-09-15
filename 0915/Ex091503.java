package top03;

public class Ex0091503 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Data02 d01 = new Data02(); // 客戶
		Data02 d02 = new Data02(); // 客戶
		String KId = "self"; // 身分
		d01.getpriv_phoneN(KId); // 查詢號碼
		d01.setpriv_phoneN("091234567"); // 長度9為錯誤電話

		/*---Data02內homeNum為static變數，正確寫法以Data02.去使用
		 * */

		// 客戶1 填寫家電

		System.out.println("家電(預設):" + Data02.homeNum);
		Data02.homeNum = "03-4560789";
		System.out.println("家電(正確範例):" + Data02.homeNum);
		System.out.println("家電(錯誤範例):" + d02.homeNum);

		/*--客戶2 填寫家電  錯誤範例   
		d02.homeNum="0800-080-123";
		System.out.println("家電:"+Data02.homeNum);
		System.out.println("家電:"+d02.homeNum);
		*/

	}

}

public class Data02 {
	private String priv_phoneN = "0912345668"; // 資料成員
	private int age;
	String phoneN01 = "2222222222";
	static String homeNum = "03-4504123";

	/* Getter, Setter 內部可寫保護機制 */
	public String getpriv_phoneN(String KId) {
		if (KId == "self") { // 檢查身分
			System.out.println("您的門號: " + priv_phoneN);
		} 
		return "驗證非本人，無權限查詢";
	}

	void setpriv_phoneN(String phoneN) { // 存取封裝成員
		if (phoneN.length() != 10) {
			System.out.println("新申請門號'" + phoneN + "'長度錯誤!");
		} else {
			this.priv_phoneN = phoneN;
			System.out.println("新申請門號電話:" + priv_phoneN);
		}

	}
	
	/* 建構子
	 * 1.命名規則->"類別名稱相同"
	 * 2.且無型別及回傳值
	 * 3.用於記憶資料使用
	 * 4.static類別不用建構
	 */
	
	public Data02() {
		
	}
	
	public Data02(int age) {
		//super();
		this.age=age;
	}
	
	public Data02(String phoneN01) {
		//super();
		this.phoneN01=phoneN01;
	}
	
	public Data02(int age,String phoneN01) {
		//super();
		this.age=age;
		this.phoneN01=phoneN01;
	}

}
