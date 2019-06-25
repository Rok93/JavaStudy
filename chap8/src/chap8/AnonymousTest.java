package chap8;


public class AnonymousTest {

	public static void main(String[] args) {
		//Worker 상속 하위클래스 정의 동시에 객체 생성
		//Worker 인터페이스 하위, 객체 생성 - 1번만 필요
		//android 프로그래밍에서 많이 쓰이는 방법
		Worker a1 = new Worker() {
			
			@Override
			public void work() {
				System.out.println("익명:work");
			}
			
			@Override
			public void lunch() {
				System.out.println("익명:lunch");
			}
		};
		
		a1.work();
		a1.lunch();
		
		Student a2 = new Student() {
			
			@Override
			public void study() {
				System.out.println("익명:study");
			}
			
			@Override
			public void lunch() {
				System.out.println("익명:lunch");
				
			}
		};
		
		
		// 나중에 Runnable 이용할 예제가 있는데 	렇게 익명 구현 객체 형식으로 사용할 것이다!
//		Runnable r1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	}

}
