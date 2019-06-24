package employee_problem;
/**
 * 비서직(Secretary class) :상속
	- 변수 선언
 	   이름 사번 본봉 일반수당 총급여
	  비서수당 
	- 생성자 정의
 	
	- 급여 계산메서드()
 	   총급여 = 본봉 + 일반수당+비서수당 	
 * @author Administrator
 *
 */
public class Secretary extends Employee {

	int secretaryPay;
	
	Secretary(int id, String name, int salary,int extraPay, int secretaryPay){
		
		super(id, name, salary, extraPay);
		
		this.secretaryPay = secretaryPay;
		
	}
	
	@Override
	public int totalSalry() {
		
		int sum = 0;
		
		sum += salary;
		sum += extraPay;
		sum += secretaryPay;
		
		return sum;
	
}
}
