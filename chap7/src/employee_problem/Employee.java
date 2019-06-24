package employee_problem;
/**
 * 회사원(Employee class){
 	- 필드변수 선언
 	   사번 이름 본봉 일반수당 총급여
 	- 생성자 정의(main)
 	e[1] = new Employee(1000,"이사원",10000,5000);
 	(총급여 제외한) 
        매개변수 4개의 값을 멤버변수 값으로  초기화.
  	- 급여 계산메서드(): 
    	   총급여 = 본봉 + 일반수당 
 * @author Administrator
 *
 */
public class Employee {

	int id;
	String name;
	int salary;
	int extraPay;
	
	Employee(int id, String name, int salary,int extraPay){

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.extraPay = extraPay;
		
	}
	
	public int totalSalry() {
		
		int sum = 0;
		
		sum += salary;
		sum += extraPay;
		
		return sum;
	}
}
