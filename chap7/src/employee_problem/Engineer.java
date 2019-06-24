package employee_problem;
/**
 * 기술직(Engineer class):상속 
 - 변수 선언
 	   이름 사번 본봉 일반수당 총급여
 	 자격수당 기술수당 
 	- 생성자 정의:main
 	
 - 급여 계산메서드()
 	   총급여 = 본봉 + 일반수당+자격수당+기술수당 	
 * @author Administrator
 *
 */
public class Engineer extends Employee {

	int rightPay;
	int techPay;

	Engineer(int id, String name, int salary,int extraPay, int rightPay, int techPay){
		
		super(id, name, salary, extraPay);
		this.rightPay = rightPay;
		this.techPay = techPay;

	}

	@Override
	public int totalSalry() {

		int sum = 0;

		sum += salary;
		sum += extraPay;
		sum += rightPay;
		sum += techPay;

		return sum;

	}
}
