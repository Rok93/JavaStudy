
public class CharacterVariableTest {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '가';
		char c3 = '0';
		char c4 = '\n'; // new line(엔터키)
		//unicode방식 " : 모든 문자 1문자 2바이트씩
		char c5 = '\u0031'; // unicode 16진수 0031 해당 문자 
		char c6 = 97; //ASCII CODE 값
	
		String s1 = "a\"b\"c";
		System.out.println("c1=" + c1 + ",  c2 = " + c2 + c4 + ", c3 = " + c3);
		System.out.println(s1);  // String 출력을 a"b"c 로 만들고 싶으면  '\' ( 큰 따음표는 역할을 수행하기 때문에 혼자 쓰일 수 없음)
		System.out.println("유니코드값 = " + c5);
		System.out.println("숫자로된문자  = " + c6);
		// c6 변수 - 32 출력  = 65(A)
		char c7 = (char) (c6 - 32) ;  // 연산처리 하라는 의미로 ( ) 처리 꼭 해야한다! 연산을 하면 자동으로 int 형을 바뀜으로 형변환 실시  
		System.out.println(c7);
		// 대문자 <-> 소문자 변환 알고리즘은 기본적을 알아야한다. 32를 더하거나 빼면 대문자<-> 소문자 변환 가능 (알파벳이 총 32개)
		
	}

}
