package top03;

public class Ex091503 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Data02 d01 = new Data02(); // 新會員1
		Data02 d02 = new Data02("0987654231"); // 舊會員2

		String KId = "self"; // 身分
		d01.getpriv_phoneN(KId); // 查詢號碼

		System.out.println("舊門號:" + d01.phoneN01);

		d01.setpriv_phoneN("091234567"); // 長度9為錯誤電話

		/*---Data02內homeNum為static變數，正確寫法以Data02.去使用
		 * */

		// 會員1 填寫家電

		System.out.println("家電(預設):" + Data02.homeNum);
		Data02.homeNum = "03-4560789";
		System.out.println("家電(正確範例):" + Data02.homeNum);
		System.out.println("家電(錯誤範例):" + d02.homeNum);

		/*--會員2 填寫家電  錯誤範例   
		d02.homeNum="0800-080-123";
		System.out.println("家電:"+Data02.homeNum);
		System.out.println("家電:"+d02.homeNum);
		*/

		/*
		 * 會員2資料 --建構子使用 可在new時給值
		 */

		System.out.print("原門號:" + d02.phoneN01);

	}

}
