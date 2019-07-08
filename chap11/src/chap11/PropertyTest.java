package chap11;

public class PropertyTest {

	public static void main(String[] args) {
		//현재자바프로그램컴퓨터 OS , 사용자이름 , 사용자홈디렉토리 , 자바디렉토리 
		String osname = System.getProperty("os.name");
		String username = System.getProperty("user.name");
		String home = System.getProperty("user.home");
		System.out.println("os= " + osname);
		System.out.println("사용자이름= " + username);
		System.out.println("홈디렉토리= " + home);
	
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("자바설치디렉토리= " + javahome);
	}

}
