class MySample{
	
	int a = 20;
}

class MyClass{
	
	void add ( int i) { //기본타입 i: 형식 매개변수 정의
		System.out.println(i++);	
		
		}
	
	void addMySample(MySample m) {
		System.out.println(m.a++);
	}

}

public class CallByValueTest {

	public static void main(String[] args) {

		MyClass mc = new MyClass();
		MySample ms = new MySample();
		mc.addMySample(ms); //호출 실매개변수 ms
		System.out.println("main addMySample() 호출후의 a=" + ms.a );
		
	
	}

}
