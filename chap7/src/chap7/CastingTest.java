package c\hap7;rrar] ) arrin];

class A{
	int i = 10;
	void ma() {
		System.out.println("A클래스");
	}
	
	void test() {
		System.out.println("오버라이딩이전");
	}
}
/**
 * 상속 클래스 생성
 * B < A
 * D < C < A
 */
class B extends A{
	int j = 20;
	void mb() {
		System.out.println("B클래스");
	}
	
	void test() {
		System.out.println("오버라이딩이후");
	}
}

class C extends A{}
class D extends C{}

public class CastingTest {

	public static void main(String[] args) {

		A a1 = new A();
		A a3 = new C(); //자동형변환
		A a4 = new D(); //자동형변환
		//		B b1 = new A(); //상속관계, 하위 <- 상위 불가
		//		B b2 = new C(); // 상속x
		//		B b3 = new D(); // 상속x
		
		A a2 = new B(); //자동형변환
		B b2 = new B();
		
		System.out.println(a1.i);
		a1.ma(); // 반환값이 없기 때문에, sout 사용 X 
		System.out.println(b2.i); //상속자동포함
		b2.ma(); // 상속자동포함
/*		System.out.println(a2.j);
		a2.mb(); */
		System.out.println(b2.j);
		b2.mb();
//		B b3 = (B) a2; //명시적형변환 : 
		//자동형변환되었다가 다시 원래 B 타입 재변환
		//B 필드와 메소드 사용 가능
		System.out.println(((B)a2).j);
		((B)a2).mb();
		
		a2.test();
		System.out.println(b2.i);
		b2.ma();
		b2.test();
		
		//Object 배열은 모든 클래스를 받을 수 있음 !!
		//But 불필요한 객체를 받을 수도 있기 때문에 더 좁은 범위로 설정하는게 좋음
		// 자동형변환 예 : 배열에 여러 객체 저장
		A [] array = new A[4];
		//A array = new A(4); // 인트타입 매개변수 있는 A객체 생성!!
		array[0] = new A();
		array[1] = new B();
		array[2] = new C();
		array[3] = new D();
		// array 배열에는 A타입 객체들 저장
		// B타입 객체만 B 타입으로 강제형변환 후 j 변수 출력 !
		for(int i = 0 ; i < array.length; i++) {
			//array[i] 대입 객체가 B의 instance(=객체) 입니까?
			System.out.println(array[i] instanceof B);
//			System.out.println(i + " : " + ((B)(array[i])).j);
		}
		else if(array[i] instanceof C)
			C c1 = (C)array[i];
		// i = 0 : 예외발생 중단 
	}
}
