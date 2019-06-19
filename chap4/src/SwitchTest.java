
public class SwitchTest {

	public static void main(String[] args) {

		/**
		 * 
		 */

		int month = 5;  // 28일까지 있습니다.
		int day = 0;

		switch(month) {
		
			case 2 :
				day = 28;
				break;
		
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				day = 31;
				break;
				
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				day = 30;
				break;
				
			default :
				day = -1;  // 5,6,7,8,9,10,11,12 월
		}

		// break; 문이 없다면 ?? 
		// 만족하는 조건부터 전부다 적용이 된다!!  결국 결과값은 -1이 나올것이다. 
		
		System.out.println(month + " 월은 " + day + " 일이 존재합니다." );

	}
}
