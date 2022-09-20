package top03;

public class Ex092001 {

	public static void main(String[] args) {
// TODO 自動產生的方法 Stub
		int v1 = 10;
		// 傳值
		System.out.println(" 傳遞value前, value = " + v1);
		Ex092001.changeValue(v1);
		System.out.println(" 傳遞value後， value = " + v1);
		System.out.println();
		
		// 傳址(參考記憶體)
		Vehicle v2 = new Vehicle(); // 建立一個Vehicle 物件
		System.out.println(" 傳遞vehicle前, wheel =" + v2.wheel);
		changeObject(v2); // 參考記憶體位置

		System.out.println(" 傳遞 vehicle 之後，wheel = " + v2.wheel);
	}

	public static void changeValue(int value) {
		value++;
		System.out.println(" 在方法中, value = " + value);
	}

	public static void changeObject(Vehicle vehicle) {
		vehicle.wheel = 4; // 改變了wheel 的值
		System.out.println(" 在方法中, wheel = " + vehicle.wheel);
	}

}

/*

class Vehicle {
	int wheel; // JVM 自動將wheel 初始化為0
}*/
