
package top02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		System.out.println(6<<2);
		// 6的2進制:00000110  
			// '00001100' 6<<1  : 12
			// '00011000' 6<<2  : 24
		
		Data data =new Data();
		data.sum(80,70,60);
		int chn,eng,math;
		
		/*自行輸入 國文,英文,數學 成績
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三科成績(國文,英文,數學):");
		chn = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		data.sum(chn,eng,math);
		data.print();
		*/
		
		//
		int mile = 800;
		System.out.println("\n里程數:"+mile+" 車資:"+data.taxi(mile));
		mile =2200;
		System.out.println("里程數:"+mile+" 車資:"+data.taxi(mile));	
		
		//
		double sp=data.setPrice(1000);
		System.out.println(sp);
		
		double tx=data.tax(400000);
		System.out.println(tx);
		
		double money=data.setshop(2999);
		System.out.println(money);
		
		int sum =0;
		System.out.print("1~100,5的倍數有:"+sum);
		for (int i=1;i<=100;i++) {
			if(i%5==0) {
				sum+=i;
					System.out.print(i+",");	
			}
			
		}
		System.out.println("\n5的倍數加總:"+sum);
	}
}

public class Data {
	int chn,eng,math;
	int sum;
	void sum(int a,int b,int c) {
		chn =a;
		eng =b;
		math=c;
	}
	int total() {
		return chn+eng+math;
	}
	double avg() {
		return total()/3;
	}
	void print() {
	System.out.println("國文:"+chn);
	System.out.println("英文:"+eng);
	System.out.println("數學:"+math);
    	System.out.println("總分:"+total());
	System.out.println("平均:"+avg());
	}
//
	int taxi(int mile){
		int money=((mile-1000)/300)*10+80;
		return mile<1000 ?80:money;
	}
//
	double setPrice(int price) {
		if(price>1000) {
			price*=0.8;
		}
		return price;
	}
	
	double tax(int income) {
		double total=0;
		if(income<=300000) {
			total =income*0.06;
		}else if (income>300000) {
			total = income*0.06+ (income%300000)*0.13;
		}		return total;
	}
	
	double setshop(int price) {
		if(price>5000) {
			price*=0.7;
		}else if(price >=4000){
			price*=0.8;
		}else if(price >=3000) {
			price*=0.9;
		}
		return price;
	}
	
}
