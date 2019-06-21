package chap7;

class Employee {
	int id;
	String name = "Employee";  //private : 정보를 은닉한다! 
	int salary;
	public Employee(int id, int salary) {
		//super();     있으나 없으나는 상관없지만 순서는 바뀌면 안된다. 제일먼저 나와야 함!! 
		this.id = id;
		this.salary = salary;
	}

	public void printField() {
		System.out.println(id + " : " + name + " : " + salary);
	}

	void calcSalary() {//연봉 계산
		salary = salary * 12;
	}

}

class Manager extends Employee {
	// 필드, 생성자, 메소드 순서 없다.  (하지만 일반적으로 필->생->메 순으로 씀 ) 
	// 자동 메소드 상속  : 상속 이후 하위클래스 메소드 수정 필요
	/*public void printField() {
		System.out.println(id + " : " + name + " : " + salary);
	}*/	

	@Override
	public void printField() {
		//Employee클래스 printField 호출
		super.printField(); //Employee의 printField 메소드 호출
		System.out.println(id + " : " + name + " : " + salary);
		System.out.println(jobOfManage);
	}

	@Override
	void calcSalary() {
		salary = (int)(salary * 12.5);
	}

	String name = "Manager";


	String jobOfManage;

	Manager(int id, int salary, String jobOfManage){
		super(id, salary); 
		//		this.id = id; //수퍼 통해서 변수 줄인다!
		//		this.salary =salary;
		this.jobOfManage = jobOfManage;
	}

	void test() {
		String name = "test";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);

	}
}

public class ManagerTest {

	public static void main(String[] args) {

		Manager m = new Manager(200, 100000, "전산관리");
		m.calcSalary(); //Employee 메소드 호출
		m.printField();
		
		//		m.test(); //  하위 클래스가 선언한 변수가 우선적으로 인식한다 !  (출력 Manager )

		//		m.id = 200;
		//		m.name = "김부장";
		//		m.salary = 100000;
		//		m.jobOfManage = "전산관리";
		//
		//		System.out.println("사번 : " + m.id + ", 이름 : " 
		//				+ m.name + ", 급여 : " + m.salary + ", 업무 : " + m.jobOfManage);

	}

}
