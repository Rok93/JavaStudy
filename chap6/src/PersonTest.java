class Person{
	
	//field 변수 - 1> non-static 변수  2> static 변수
	String name; //이름
	int age; //나이
	final static String nation = "대한민국"; //국적 모든객체 1개 공유
}

public class PersonTest {

	public static void main(String[] args) {

		System.out.println("사람들의 국적은 " + Person.nation);
		//static 으로 선언된 변수는 객체를 만들기 전에도 사용할 수 있다.  
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age =20;
		//p1.nation = "대한민국"; 
		//nation이 static 변수라 여기서 미국이라고 해버리면 심청이도 미국으로 바뀜 final 로 방지시켜야함
		//final 과 static 이 동시에 주어지는 경우가 많다. (코딩해보면 그렇게 된다....) 
		System.out.println("이름: " + p1.name + " 나이: " + p1.age 
				+ " 국적: " +p1.nation);

		Person p2 = new Person();
		p2.name = "심청이";
		p2.age =25;
		//p2.nation = "대한민국";
		System.out.println("이름: " + p2.name + " 나이: " + p2.age + 
				" 국적: " +p2.nation);
	}

}
