
public class WhileTest {

	public static void main(String[] args) {

		int random = (int) (Math.random()*100) +1 ;
		int su = 1;	
		System.out.println("반복중단 su 조건 = " + random);
		
		while (true) {
			if( su == random) { break; }	//무한반복종료 
			System.out.println(su);	// 1 2 3 4 
			su++; 
		}
		
	}
}
