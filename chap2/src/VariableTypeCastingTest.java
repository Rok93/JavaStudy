/**
 * 형변환에 관련된 실습 예제
 * @author 김경록
 * @version 0.0.1 2019-06-13
 */
public class VariableTypeCastingTest {

	public static void main(String[] args) {

		byte b1 = 127;
		byte b2 = 1;
		byte b3 = (byte) (b1 + b2) ; 
//		1> int <-- byte 연산자 byte	: 자동형변환
//		2> byte <-- 1번  int	: 명시적형변환(사용자지정)
//		3> 명시적형변환 연산자: (데이터타입) ????
		
		int i1 = 10;
		int i2 = 3;
		//자바 : 정수 / 정수 -> 정수몫
		System.out.println((float) (i1 / i2));
		//자바 : 정수 연산자 실수 -> 자동 실수 형 변환 
		System.out.println((double) i1 / i2);
		
		//정수 나누기
		// 10 / 3 --> 3 
		// (double)10 / 3 ---> 3.3333...
	
		double avg = (79.6+83.0+34.5) / 3;
		System.out.println((int) avg);
		
		char c1 = 97 - 32;
		
		boolean bool1 = true;
		int zero = 0; // zero 0이면 남, 1이면 여
//		bool1 = zero; // true , false 2개 표현 
		
	}
}
