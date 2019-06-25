package chap8;

public class StuWorker implements Student, Worker {
	//필드 생성자 메소드 추가 정의 선택적
	// 인터페이스 모든 메소드 구현 오버라이딩 필수 !! 
	// work, lunch
	// study, lunch      ==> work, study, lunch 총 3개 오버라이딩 
	
	//접근관련 modifier는 같거나 더 넓은 범위로 선언되어야한다. 
	// Interface 는 public abstract가 자동으로 선언된다.
	// But ** Interface 구현클래스는 일반 클래스이므로 public 을 선언해야한다!! 
	
	//상속 필드 2개 + 현재 1개 : name -> Worker.name  Student.name
	// 그냥 name (=this.name)  매개변수가 name 이라면 this.name !!
	String name = "조교";
	
	void test() {
		System.out.println(count); //count가 한 인터페이스에서 만 선언되서 그냥 쓰면 된다.
		System.out.println(name);
		System.out.println(Worker.name);
		System.out.println(Student.name);
	}
	
	@Override
	public void work() {
		System.out.println("조교가 오전에는 일합니다.");
	}

	@Override
	public void study() {
		System.out.println("조교가 오후에는 공부합니다.");
	}

	@Override
	public void lunch() {
		System.out.println("조교가 점심 먹습니다.");
	}

}
