package chap11;

public class FianlizeTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("f1");
		MyObject o2 = new MyObject("f2");
		System.out.println("2개 객체 생성");
		o1 = null;
		o2 = null;
		System.out.println("2개 객체 삭제 예정");
		//garbage collection : 우선순위 가장 낮은 작업
		//자바 다른 클래스 실행 바쁘면 g/c 작업 미룬다
		System.gc(); // g/c 작업 앞당겨줘... 요청 
		System.out.println("2개 객체 삭제");
		
	}
}
