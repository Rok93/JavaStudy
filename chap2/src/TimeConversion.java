
public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 100000;
		// 10000초는  xx 시 xx 분 xx 초 로 만들어라
		int h,m,s;  // 정수형 hour , minute , second (약자) 변수선언 
		int tempTime = time;


		h = time / 3600; // hour 정의

		tempTime = time % 3600;	// time 에서 hour(s) 만큼 빼기

		m = tempTime / 60 ;  // minute 정의
		tempTime = tempTime % 60; // time 에서 minute(s) 만큼 빼기

		s = tempTime;

		if(h > 24) {
			System.out.println(time + "초는 만 1일이 넘었습니다.");
		}
		else {
			System.out.print(time +"초는 " + h + "시 " + m + "분" + s + "초 입니다.");
		}

		// sql에서도 dbms_output.put() 쓰면 print 와 같이 inline 출력을 한다.
		// timeTemp 라는 새로운 변수 선언해도 되고, time 값이 바뀌기 전에 먼저 출력하는 방법도 하나의 방법!

		// 추가조건 
		// 24시간 초과시 "만 1일이 넘었습니다" 출력
	}
}
