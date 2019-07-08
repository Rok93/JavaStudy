package chap11;

//getClass() 는 현재 클래스의 타입을 가져온다.
//getName 현재 클래스의 이름을 가져온다.

class A {
	void ma() {
		System.out.println(getClass().getName());
	}
}

class B extends A{ }

public class ClassTest {

	public static void main(String[] args) throws Exception {
		
		A a1 = new A();
		a1.ma();
		
		B b1 = new B();
		b1.ma();
		
		// static 변수와 static 메소드만 사용
		Class cls = Class.forName(args[0]);
		Object o = cls.newInstance(); //동적객체생성
		//chap11.B
//		if(o instanceof A){ } ..... 
			
		System.out.println
		(o.getClass().getName() + " 타입의 객체를 생성했습니다."); //현재
		 
//		SPRING
		
	}
}
