package chap11;

public class ObjectClassTest {

	public static void main(String[] args) {

		Object o1 = new MyObject("java");
		Object o2 = new MyObject("java");   //Object의 객체는 만들 필요가없음... 이미 상속되어있어서

		//어떤 객체를 생성하던지간에 toString 메서드가 없는 객체는 없다 ( Object 상속되어있어서)
		System.out.println(o1); /* .toString() 자동 호출결과*/ //"자바" 출력 원한다;
		// ==System.out.println(o1.toString());
		System.out.println(o2);
		// ==System.out.println(o2.toString());
		//java.lang.Object + @ + 16진수(주소) 

		if(o1 == o2) { //false   (객체 주소를 비교하기 때문에... 같지않다)
			//String의 equals가 아니라 Object의 equals 
			//오버라이딩 못한다. (연산자)
			System.out.println("o1 == o2 : true");
		}

		if(o1.equals(o2)) { //true (by. Override)  equals 도 주소확인한다! (원래) 
			//오버라이딩 가능하다. (equals 메서드)
			//String의 equals가 아니라 Object의 equals
			System.out.println("o1.equals(o2) : true");
		}
		
		String s = new String ("java");
		if(o1.equals(s)) {
			System.out.println("o1.equals(s) : true");
		}
	}
}

class MyObject {
	String msg;
	MyObject(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		// 리턴결과가 출력 ==> 객체생성 매개변수전달 문자열
		return msg;
	}

	//, equals() 오버라이딩
	//	전달매개변수타입 MyObject 타입이고
	//	현재객체 msg 변수값과 o2 객체 msg 변수값이 같으면 true
	//	나머지 false 

	@Override
	//o1.equals(new MyObject("java")) -> true
	//o1.equals(new String("java")) -> false
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
			boolean result =
					msg.equals( ((MyObject) obj).msg );
			return result;
		}
		else {
			return false;
		}
	}

	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("MyObject finalize() 실행중 ...");
	}
	
	


}
