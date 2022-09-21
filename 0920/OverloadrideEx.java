package top04;

public class OverloadrideEx {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal bird = new Bird();
		act(animal); // move
		act(dog);    // run
		act(bird);   // fly
		
		
		private static void act(Animal animal) { // 因為多型，所以參數以通用的父類別傳入
			animal.move(); // 因為多型及覆寫，所以實際執行的方法為子類別的方法內容
			animal.move(3);
			animal.move("Muick");
		}
		
		
		/*	
		private int num;
		public String name;
		
		Num iarr = new Num();
		int n = 5;
		iarr.setNum(19);
		iarr.serName("Mr.J");
		iarr.getNum();
		iarr.getName();
		System.out.println(iarr.getNum());
		System.out.println(iarr.getName());
				
		System.out.println(iarr.m());
		System.out.println(iarr.m(n));
		System.out.println(iarr.m(8,2.5));
		 */	
	}

}

class Animal {
	private String name="Animal";
	private String D_name = "Muick";
	private String B_name = "Bird";
	
	Animal(){ //預設建構子, 可有可無
	
	}
	
	public String getName(){
		return name;
	}
	
	
	public void move(){
	System.out.println("move");
	}
	
}

class Dog extends Animal{
	@Override
	String name ="Dog";
	public void move(){
	System.out.println("run");
	}
	
	public void move(int num){
		
		System.out.println( this.name + "run" + num + "圈");
	}
	
}

class Bird extends Animal{
	String name="Bird";
	@Override
	public void move(){
		System.out.println("fly");
	}
	
	public void move(String name){
		
		System.out.println( name + "fly");
	}
}




/*
public class Num extends OverloadrideEx{
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
*/
