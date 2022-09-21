package top03;

public class Exfoclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personal per = new Personal();
		Teacher teac = new Teacher();
		Personal pt = new Teacher();
		
		int idN;
		idN = per.id;
		/**
		 * 透過fo.可以找到Personal類別所屬成員及Object methods
		 * 說明:Java系統預設幫Personal類別繼承Object類別(隱含式)
		 * 若子類別已繼承Personal,則chriden類別則不會繼承Object(Personal已繼承)
		 */
		
		System.out.println(per.name);  // Father_Class
		System.out.println(teac.name); // Chindren_Class
		//多載(Overload)結構
		teac.printPerinfo(); //子類別若有,則不會去找父類別的方法
		teac.printPerinfo(10); //Teacher_methods_int
		teac.printPerinfo("Str"); //Teacher_methods_Str
		//覆寫(Override)結構
		pt.printPerinfo(10); //同 teac.printPerinfo();
		
	}

}

class Personal {  //public 加上 檔案名稱必須等於類別名稱
	public String sid;   //編號
	public String name ="Father_Class";  //姓名
	public int id =  001;	     //部門編號
	private String kid;  //身分證號 private成員無法被繼承
	
	public void printPerinfo() {
		//System.out.println("姓名: " + name +"部門編號: " + id);
		System.out.println("Father_methods");
	}
	public void printPerinfo(int f) {
		System.out.println("Father_methods_"+f);
	}
}

/**
 * 多載(Overload): 同一個類別, 多載方法名稱相同, 簽名(參數)個數或型別不同.
 * 覆寫(Override): 子類別中, 覆寫的方法的名稱, 簽名(參數)個數必須完全相同.
 * */
class Teacher extends Personal{
	public String deptName;  //部門名稱
	public String course;    //任教科目
	public String name = "Chindren_Class";
	
	public void print() {
		System.out.println("部門: " + deptName +"任教科目: " + course);
	}
	public void mark() {
		System.out.println("列印學生成績");
	}
	//多載開始 例: Scanner
	public void printPerinfo() {
		System.out.println("Teacher_methods_0");
	}
	public void printPerinfo(int a) {
		System.out.println("Teacher_methods_"+ a );
	}
	public void printPerinfo(String s) {
		System.out.println("Teacher_methods_Str");
	}
}
