package top02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Data data =new Data();
		data.sum(80,70,60);
		data.print();
		
		int mile = 800;
		System.out.println("\n里程數:"+mile+" 車資:"+data.taxi(mile));
		mile =2200;
		System.out.println("里程數:"+mile+" 車資:"+data.taxi(mile));		
		
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

	
	int taxi(int mile){
		int money=((mile-1000)/300)*10+80;
		return mile<1000 ?80:money;
	}
