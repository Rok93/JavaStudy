
public class MainTest {

	public static void main(String[] args) {

		System.out.println("커맨드라인 입력 변수의 갯수 = " + args.length);
		
		for ( String str : args)
			System.out.println(str);  //입력변수내용 출력!
		// "100" --> 100  (Stirng -> int) 
		// 형변환은 기본타입끼리 가능하다  String 은 기본타입이 아니야(참조타입)
		System.out.println(args[0] + args[1]);
		
		// 자바 Api = 내장 클래스 메소드 도움
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);
		//Double.parseDouble("3.14");
	}
}
