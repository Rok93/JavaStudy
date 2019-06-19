
public class StudentsTest {

	public static void main(String[] args) {
		//학생객체 생성 (여러명 생성 가능)
		Student st1 = new Student("1900011","이학생","it경영학부");
		// 클래스명 객체참조변수명 = new 생성자
		System.out.println("학번 =" + st1.id + " 이름 =" 
				+ st1.name + "전공 =" +st1.major);

		//학생 객체2 생성
		Student st2 = new Student("1800011","김학생");
		System.out.println("학번 =" + st2.id + " 이름 =" 
				+ st2.name + "전공 =" +st2.major);

		//학생 객체3 생성
		Student st3 = new Student("1700011");
		System.out.println("학번 =" + st3.id + " 이름 =" 
				+ st3.name + "전공 =" +st3.major);

		Student st4 = new Student();
		st4.id="";
	}
}

//학생객체 정적특성 설계 + class 정의 (1번)
class Student{

	String id;
	String name;
	String major;

	// 기본생성자 Student(){}  생략하더라도 자동으로 정의된다.
	// 사용자설정 기본생성자 3개
	Student (String id, String name, String major) {

		this.id = id;
		this.name = name;
		this.major = major;
		// 만약 변수 초기화 .. 50문장 
		// this 이용해서 생성자 overloading 가능
	}

	// 전공을 모르는경우 학번과 이름만 입력 받을  수 있게 생성자를 오버로딩
	Student (String id, String name) {

		this (id, name, "전공확인불가");
//		== new Student(id , name, "전공확인불가");
//		this.id = id;
//		this.name = name;
//		this.major = "전공확인불가";

	}

	// 전공도 이름도 모르는 경우 학번만 입력받을 수 있게 생성자를 오버로딩
	Student (String id) {

		this (id , "무명" , "전공확인불가");
		
//		this.id = id;
//		this.name = "이름확인불가";
//		this.major = "전공확인불가";
	}

	// 아무것도 모르는 경우에는 클래스 사용하겠다면 기본 생성자도 지정
	Student(){
		System.out.println("초기화변수없다");
	}

	Student(int i , String s){
	}
	// 타입,갯수 같지만 순서가 다르기 때문에, 생성자 overloading에 해당!
	Student(String s , int i){
	}
	
	//매개변수이름만 다른경우에는 다른 생성자로 보지않는다! 즉 같은 생성자
//	Student (int i , String s){}
//	Student (int s , String i){}
	
	

}