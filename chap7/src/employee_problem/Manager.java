package employee_problem;
/**
 * 간부직(Manager class) : 상속{
	- 변수 선언(자동포함 제외 추가 변수 선언)
 	   사번 이름 본봉 일반수당 총급여
	  간부수당
	- 생성자 정의
 	Manager(2000,"김간부",20000,10000,10000);
        (Manager 생성자 내부 첫문장 super() ; 정의
         Employee() 생성자 호출)


- 급여 계산메서드()
 	   총급여 = 본봉 + 일반수당+간부수당  
 * @author Administrator
 *
 */
public class Manager extends Employee {
	
	int managerPay;
	
	Manager(int id, String name, int salary,int extraPay,int managerPay){
		super(id, name, salary, extraPay);
		
		this.managerPay = managerPay;
	}
	
		@Override
		public int totalSalry() {
			
			int sum = 0;
			
			sum += salary;
			sum += extraPay;
			sum += managerPay;
			
			return sum;
		
	}
}
