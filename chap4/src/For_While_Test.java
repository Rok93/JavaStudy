
public class For_While_Test {

	public static void main(String[] args) {

		int su = (int) (Math.random()*9) + 1;
		//구구단 출력 도중에 su와 같은 j 만나면 출력 생략
		System.out.println("su = " + su);
		
		for ( int i = 2; i <= 9; i ++) {
			System.out.println("<< " + i + "단 출력>>");
			for ( int j = 1; j <= 9; j++) {
				if(j == su)
					break; //반복 종료
				//continue 일시반복생략
				System.out.println(i + "*"+ j + "="+ i*j);
			} 
		}
	}
} 