package chap11;

class A1 {
	void ma() {
		B1 b1 = new B1();
		b1.mb(-10);
	}
}

class B1 {
	void mb(int i) {
		if( i >= 10 ) {
			System.out.println("진행합니다");
		}
		else{
			System.out.println("진행할 수 없습니다");
			return; 
			//return; //mb() 메소드 중단
			//System.exit(0);  <- return 과 함께 쓰일 수 없다! 
			//프로그램실행중단
		}
		System.out.println("mb 메소드를 종료합니다.");
	}
}

public class ExitTest {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.ma();
		System.out.println("main 메소드를 종료합니다.");
		System.out.println("게시판프로그램");
		System.out.println("1. 게시물보기");
		System.out.println("2. 글쓰기");
		System.out.println("3. 프로그램종료");
		System.out.println("번호입력 : ");
	}
}
