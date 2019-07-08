package chap11;

public class TimeTest {

	public static void main(String[] args) {
		// 1970y/1m/1d/0h/0m/0s ~ 오늘날짜시간 1/1000 s 단위  (8바이트 정수) 
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		for(int i = 1; i <= 1000; i ++) {
			System.out.print(i);
		}
		System.out.println();
		
		long end = System.currentTimeMillis();
		System.out.println
		("반복문수행에 소요된 시간 = " + (end - start) 
				+ "ms 소요되었습니다."); //반복문 수행하는데 걸리는 시간  (ms)
		
	}
	

}
