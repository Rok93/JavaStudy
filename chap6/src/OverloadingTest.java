
//메소드 오버로딩 예제

class C{
	int i ; // 0
	
	int add(int i, int j){
		//this("1" , "2"); //생성자에서만 사용 가능. 같은 클래수 내부 다른 "생성자" 호출
		this.i = i + j;//메소드 + 생성자 사용 가능
		add("1","2");
		return i + j; //정수 산술 덧셈
	}
	
	String add(String i, String j){
		return i + j; //문자열 결합
	}
	
	double add(double i, double j) {
		return i + j; // 실수 산술 덧셈
	}
	
}

public class OverloadingTest {

	public static void main(String[] args) {
		
		C c1 = new C();
		int result1 = c1.add(1, 2);
		double result2 = c1.add(3.14, 2.5);
		String result3 = c1.add("java","html5");
		
		System.out.println("정수덧셈결과 = " + result1);
		System.out.println("실수덧셈결과 = " + result2);
		System.out.println("문자열결합결과 = " + result3);
		
		int decimal = Integer.parseInt("100");
		int bin = Integer.parseInt("100", 2);
		System.out.println("십진수 변환 = " + decimal);
		System.out.println("이진수 변환 = " + bin);
		
	}
}
