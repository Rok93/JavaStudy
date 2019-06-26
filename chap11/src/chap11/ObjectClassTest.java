package chap11;

public class ObjectClassTest {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();   //Object의 객체는 만들 필요가없음... 이미 상속되어있어서
		
		//어떤 객체를 생성하던지간에 toString 메서드가 없는 객체는 없다 ( Object 상속되어있어서)
		System.out.println(o1/* .toString() 자동 호출결과*/) //"자바" 출력 원한다;
		// ==System.out.println(o1.toString());
		System.out.println(o2);
		// ==System.out.println(o2.toString());
		//java.lang.Object + @ + 16진수(주소) 
		
		if(o1 == o2) { //false   (객체 주소를 비교하기 때문에... 같지않다)
			//String의 equals가 아니라 Object의 equals 
			//오버라이딩 못한다. (연산자)
			System.out.println("o1 == o2 : true");
		}
		if(o1.equals(o2)) { //false (Object의 equals는 == 와 같이 주소 값을 비교한다. ) 
			//오버라이딩 가능하다. (equals 메서드)
			//String의 equals가 아니라 Object의 equals 
			System.out.println("o1.equals(o2) : true");
		}
		
	}

}
