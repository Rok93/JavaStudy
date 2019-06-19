
public class MethodTest {

	public static void main(String[] args) {
		B b1 = new B();

//		int result1 = b1.m1();
//		b1.m2();
//		String result3 = b1.m3(); //return 전에 출력도 시행한다.
//
//		System.out.println("m1호출결과 = " + result1);
//		System.out.println("m3호출결과 = " + result3);
		b1.m1();
		b1.m5();
		System.out.println("메인종료");
	}

}

class B{//메소드

	int m1 () { 
		int i = 10; // 지역변수 
		return i*i; // m1메소드 수행완료결과 되돌려준다.  마지막 문장 
	}

	void m2() {	//return 타입이 없다.
		int j = 20;
		System.out.println(j*j);
	}

	String m3() {	
		String s = "local";
		System.out.println(s + " var");
		return s;
	}

	int m4() {
		int i = 10;
		if( i < 10) {

			return i * i;

		} 

		else {

			return i;

		}
	}

	void m5 () {
		m1();
		int i = -10;
		//i 양수이면 (0 or 음수  --> 수행X)

		if(i <= 0) {
			return; //메소드 중단 용도 
					//메소드 수행 결과를 되돌려 주는 용도
		} 

		System.out.println(i*i);
	}
}


