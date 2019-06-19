class Employee{
	/**
	 * 회사원 변수 :
	 * 문자열==> 사번 , 이름, 부서, 
	 * 숫자==> 급여, 보너스 선언
	 */
	String id;
	String name;
	String department;
	int salary;
	double bonus;

}

class EmployeeTest {

	public static void main(String[] args) {
		/**
		 * run configurations=arguments-program argument
		 * 실행 1001 김사원 전산부서 100,000(급여) 입력받아서
		 * 1> 회사원 객체 생성
		 * 2> 1번 생성 객체 내부 사번,이름,부서,급여를 입력받은 변수값 대입
		 * 3> 보너스 계산 
		 * 전산부서 또는 ITPROG부서 : 급여*2
		 * 인사부서 : 보너스 = 급여*1.5
		 * 기획부서 : 보너스 = 급여*1.2
		 * Others : 보너스 = 급여 
		 * 4> 출력
		 * 사번 : 1001
		 * 이름 : 김사원
		 * 부서 : 전산부서
		 * 급여 : 100000
		 * 보너스 : 200000
		 */

		Employee emp = new Employee();

		/**
		 * args 배열의 원소가 현재 4개 주어져야하기 때문에, 이렇게 제약조건을 줘본다! 
		 * 
		 */
		if(args.length < 4) {
			System.out.println("입력변수 갯수를 확인하세요! ");
		}
			
		else {
			
			emp.id = args[0];
			emp.name = args[1];
			emp.department = args[2].toUpperCase(); // sql 함수명 ('데이터')
			emp.salary = Integer.parseInt(args[3]);

			int gap = 'A' - 'a' ; 

			/**
			 * department 소문자 입력 -> 대문자로 변환
			 * toUpperCase() 메소드 이용해서 소문자 입력을 모두 대문자 입력으로 변경
			 */

			if(emp.department.equals("전산부서") ||
					emp.department.equals("ITPROG")) {
				emp.bonus = emp.salary * 2.0;
			}
			else if(emp.department.equals("인사부서")) {
				emp.bonus = emp.salary * 1.5;

			}
			else if(emp.department.equals("기획부서")) {
				emp.bonus = emp.salary * 1.2;
			}
			else {
				emp.bonus = emp.salary;
			}


			System.out.println("출력");
			System.out.println("사번 : " + emp.id);
			System.out.println("이름 : " + emp.name);
			System.out.println("부서 :" + emp.department);
			System.out.println("급여 : " + emp.salary);
			System.out.println("보너스 : " + emp.bonus);

		}
	}
}
