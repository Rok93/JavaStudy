package jdbc;

//java.util.40여개클래스 모두 사용 예정
import java.util.*; //util 패키지 모두 사용

/*import oracle.A;
import oracle.B; */
import oracle.*; // orcle 패키지 모두사용
/**
 * import 자동 생성 
 * 1. 현재파일과 같은 패키지 속한 클래스
 * 2. .api : java.lang 패키지 속한 클래스
 * 3. 
 */

// 170여개 패키지(API) 사용할 예정이므로 import 숙지
// 다른 패키지의 클래스 호출
public class C {

	public static void main(String[] args) {

		A a1 = new A("C클래스");
		//import 가없다면 객체 생성할 때, 
		//oracle.A al = new orcle.A(); 번거롭..
		B a2 = new B();
	
		Date now = new Date();
		System.out.println(now);
		
	}

}

