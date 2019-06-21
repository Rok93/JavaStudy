package chap7;

final class Math { //수학공식
	//절대값메소드(절대불변의 진리공식)
	
	void abs(int i) {
		if( i < 0) {
			i *= -1;
		}
		System.out.println("절대값= " + i);
	}
	
	void power (int i , int j) {
		System.out.println(i * j);
	}
	
}

class MyMathChild { /* extends Math*/
	void print() {
		System.out.println("출력합니다.");
		Math m = new Math();
		m.abs(-100);
		m.abs(100);
	}

	/*  abs 메소드 final 메소드 이므로 오버라이드 불가능 !! 
	 * @Override void abs(int i) { if(i > 0) { i *= -1; } System.out.println(i); }
	 */
}

public class FinalTest {

	public static void main(String[] args) {

		MyMathChild ch = new MyMathChild();
		
//		ch.abs(100);
//		ch.abs(-100);
		ch.print();
		
	}

}

// final 클래스는 상속 불가능 하기 때문에 꼭 사용해야한다면... 
// 객체를 만들어서 사용할 것 !! 

class MyString {
	//문자열, 정수  자바"규칙"타입 
	void ma() {
		String s = new String();
		s.equals("");
		Integer i = new Integer(100);
	}
}
