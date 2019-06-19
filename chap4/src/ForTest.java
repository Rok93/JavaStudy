/**
 * 1 부터 10까지의 정수의 총합
 * @author Administrator
 * 1 - 10 정수 총합
 */
public class ForTest {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("<<For문으로 출력합니다>>");
		for (int i = 1; i <= 10; i++) {  
			sum += i;
			System.out.println(i + "까지의 총합 = " + sum);
			
		}
		
//		for (  i = 1; i <= 10; i+=2) {     // 5번 반복
//			sum += i;
//			System.out.println(i + "까지의 홀수의 총합 " + sum);
//		}

//		for (  i = 1; i <= 10; i+=2) {     // 10번 반복  (횟수적으로 적게 돌아가는 위의 알고리즘이 더 효율적이다 ! ) 
//			if ( i % 2 == 1) {
//				sum += i;
//				System.out.println(i + "까지의 홀수의 총합 " + sum);
//			}
//		}

		System.out.println("1부터 10까지의 홀수의 총합 = " + sum);
		System.out.println();

		
		System.out.println("<<While문으로 출력합니다>>");
		
		int i = 0;
		sum = 0;
		
		while(i <= 10) {
			sum += i;
			System.out.println(i + "까지의 총합 = " + sum);
			i++;
		}
		
		System.out.println("While 종료 이후 i = " + i);
		System.out.println("(While) 1- 10 총합 = " + sum);
		
		}
	}

