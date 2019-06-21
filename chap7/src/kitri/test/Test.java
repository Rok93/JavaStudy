package kitri.test;
import kitri.system.*;;

public class Test {

	public static void main(String[] args) {
		/*명령행 매개변수가 Directory kitri 인 경우
        (= 갯수 2개이고 첫번째값이 Directory 이라면)
두번째 입력값인 kitri 라는 이름의 
        MyDirectory 객체를 생성하여 
        print 메소드 호출한다.

		 */

		if(args.length == 2 && args[0].equals("Directory")) {
			//kitri == args[1] 인데 args[1] 을 넣으면 오류! 어떻게?
			MyDirectory md = new MyDirectory(args[1]);
			md.setName(args[1]);
			md.print();;
		}


		/*
명령행 매개변수가 File sample txt 1000 인 경우
      (= 갯수 4개이고 첫번째값이 File 이라면)
두번째 입력값인 sample 세번째 입력값 txt 이름을 가진 길이 1000 바이트의 
       MyFile 객체를 생성하여 
       print 메소드 호출한다.  
		 */

		if(args.length == 4 && args[0].equals("File")) {
			String fileName = args[2];
			fileName += ".";
			fileName += args[3];

			MyFile mf = new MyFile(fileName, Integer.parseInt(args[3]));
			mf.setName(fileName);
			mf.setSize(Integer.parseInt(args[3]));
		}
	}

}
