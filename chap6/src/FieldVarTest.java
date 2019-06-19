
public class FieldVarTest {

	public static void main(String[] args) {

		int i = 0; //지역변수 (자동초기화x) 
		System.out.println(i); //메인메소드내부선언변수
		
		A a1 = new A();
		//클래스명 변수명 = new 클래스명()
		System.out.println(a1.i); //0:자동초기화
		System.out.println(a1.s); //null
		System.out.println(a1.d); //0.0
		System.out.println(a1.b); //false
		System.out.println(a1.c); //''

		// 객체참조변수명.field변수
		// 필드변수 초기화하지 않아도 자동 값 저장
		// int등 정수 : 0
		// double 실수 : 0.0
		// boolean : false
		// char : '\u0000' : ''
		// String , 배열 , 참조타입들 : null
	}

}

class A {

	int i; //field 변수
	String s;
	double d;
	boolean b;
	char c;

}




