/**
 * 조건문 학습 예제
 * IF - ELSE  / SWITCH 
 * 주어진 문자 : A --> A를  소문자로 변경 : a 
 * 주어진 문자 : a --> a를  대문자로 변경 : A 
 * 주어진 문자 : 특수기호 : "알파벳이 아닙니다" 출력
 * @author Rok93
 * @version 2019-06-14
 */
public class AlphaTest {

	public static void main(String[] args) {
		
		
//		int al = (int) (Math.random()* ('z'-'A'+1) + 65);
//		//65 ~ 122
//		
//		/**
//		 * 나의 답변 
//		 */
//		
//		char c = (char) al;
//		char original = c;
//		
//		if( c >= 'a' && c <= 'z') {
//			c += ('A'-'a');
//		}
//
//		else if ( c >= 'A' && c <= 'Z') {
//			c -= ('A'-'a');
//		}
//		
//		else {
//			System.out.println("알파벳이 아닙니다.");
//		}
//		
//		System.out.println(original + " -> " + c);
		
		
		/**
		 * 강사님 답변           (각 char 알파벳의 숫자 범위를 안다면 이렇게 처리 할 수도있겠다 !! )
		 */
		
		int al = (int) (Math.random() * ( 122-65+1) + 65);
		
		if ( al >= 65 && al <= 90) {
			
			System.out.println((char) al + " 를 소문자로 변경하면 " + (char) (al+32));
		}
		
		else if (al >= 97 && al <= 122) {

			System.out.println((char) al + " 를 대문자로 변경하면 " + (char) (al-32));
		}
		
		else {
			System.out.println("알파벳이 아닙니다.");
		}
		
		
		
	}

}
