class SingleTon{
// 자바 -- orcle(외부 접속 최대치 : 100)   연동
	private static SingleTon s; // 자신객체 필드변수

	private SingleTon(){
		System.out.println("SingleTon 생성자호출");
	}

	public static SingleTon getInstance() {
		//외부클래스 생성자 호출 막음.   생성자호출 경로 오로지 메소드
		if( s == null) { // 객체생성된 적 없다.
			s = new SingleTon();
		}
		return s;
	}
}
// 생성자 호출을 외부에서 함부로 못하게 할려고 private 걸고...  
// static 메소드를 통해서 한번만 생성자 호출 가능하도록 설정

public class SingleTonTest {

	public static void main(String[] args) {

		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();

	}
}
