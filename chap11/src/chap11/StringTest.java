package chap11;

import java.io.UnsupportedEncodingException;

public class StringTest {

	public static void main(String[] args) throws Exception {

		String first = "Arnold";
		String middle = "Alois";					
		String last = "Schwarzenegger";
		String initials;
		String firstInit, middleInit, lastInit;

		firstInit = first.substring(0,1);
		middleInit = middle.substring(0,1);
		lastInit = last.substring(0,1);
		initials = firstInit + middleInit + lastInit;

		System.out.print("1. 이름: ");
		System.out.println(first + " " + middle + " " + last);
		System.out.print("2. 이름 (대문자): ");
		System.out.println(first.toUpperCase() + " " + last.toUpperCase());
		System.out.print("3. 이니셜:  ");
		System.out.println(initials);

		System.out.println("4. First Name은 arnold이다. (대소문자 구분; T/F):  " +  first.equals("arnold"));
		System.out.println("5. First Name은 arnold이다. (대소문자 미구분; T/F):  " + first.equalsIgnoreCase("arnold"));
		System.out.println("6. Last Name " + last + "의 index 번호 6~14까지 문자열 : " + last.substring(6 , 14)); //last : 13인덱스
		System.out.println("7. Last Name " + last + "에서 negger 문자열의 위치 : " + last.indexOf("negger"));		

		//valueOf() : 정수를 문자열 변환 : static 메소드
		int i = 100;
		String si = String.valueOf(i);
		System.out.println(si instanceof String);

		//sql
		// length('자바') --> 2 (길이)  lengthb('자바')  --> 6 (byte)
		String str = "안녕";
		System.out.println("'안녕' 의 글자수 = " + str.length()); //2 
		//문자 이진수 표현 방식 : utf-8 방식, euc-kr 방식(한글 표현)
		byte[] str_b = str.getBytes("utf-8");
		System.out.println("'안녕'의 바이트수= " + str_b.length);

		byte b[] = {65 , 66 ,67 ,68}; // ABCD 
		String sb = new String(b);
		System.out.println(sb);
		//호출 method(
		// method(byte[] g s) { s = new String(b); 
		//	s.equals("")}

		
		char c[] = {'a', 'b', 'c', 'd' };
		String sc = new String(c);
		System.out.println(sc); //abcd
		
	}

}
