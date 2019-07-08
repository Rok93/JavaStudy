package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		/*
		 * 1. jdbc driver 등록
		 * 2. db 정보에 맞는 db 연결
		 * 3. sql 작성-전송
		 * 4. sql 결과 조회
		 * 5. 연결 해제
		 */
		
		Connection con = null;

		//ojdbc6.jar -> oracle.jdbc.driver 패키지의 OracleDriver클래스
		try {
			//1. jdbc driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");//외부에 있는 다른라이브러리 등록
			//2. db 정보에 맞는 db 연결
			//connection은 인터페이스로 객체 생성 불가능 => 드라이버 불러와서 사용
			//jdbc:oracle:thin: 까지는 동일 / @localhost:1521:xe 이부분 바뀜
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "h");
			System.out.println("db 연결 성공");

			//3. sql 작성-전송
			//4. sql 결과 조회
			//5. 연결 해제
			System.out.println("db 연결 해제");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar 파일이 없거나 클래스명을 확인해주세요.");
		} catch (SQLException e) {
			// oracle 수동 시작 설정이면 연결 안 될 가능성 있음...
			// 문법, 제약조건 등 의 
			System.out.println("연결 정보를 확인하세요"); // connection con객체 생성문장에 문제가 생긴 경우
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 파일 소켓(네트워크 회선)  db사용중 완료알려주는문장 : finally
		}
		
	}

}
