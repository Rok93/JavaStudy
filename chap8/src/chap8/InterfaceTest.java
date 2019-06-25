package chap8;

public class InterfaceTest {

	public static void main(String[] args) {
		//자동형변환 이후 접근가능한 필드변수, 메소드 : 상위인터페이스 
		// 접근 가능 오버라이딩메소드 : 하위클래스 
		
		Worker w = new StuWorker();		
		w.work();
		w.lunch();
		
		Student s = new StuWorker();
		s.study();
		s.lunch();
		
		StuWorker sw = new StuWorker();
		sw.work();
		sw.lunch();
		sw.study();
		sw.test();
		
		//Worker Interface를 상속받은 A, StuWorker가 있음
		Worker [] wor = new Worker[2];
		wor[0] = new A();
		
		
		
	}
}

class A implements Worker{
	
}

