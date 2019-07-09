package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PagingTest {

	public static void main(String[] args) {

		ResultSet rs = null;
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
			Class.forName("oracle.jdbc.driver.OracleDriver");//외부에 있는 다른라이브러리 등록
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "hr");
			System.out.println("db 연결 성공 (자동 commit)");
			System.out.println(con.getAutoCommit());

			//키보드 입력 : 1 ~ 5: 10 페이지 가정하고 한페이지 5개씩 보여준다
			// 1 ~ 5 / 6 ~ 10
			Scanner sc = new Scanner(System.in);
			int currentPage = sc.nextInt();
			int recordCnt = sc.nextInt();

			
			int start = (currentPage-1)*recordCnt + 1;
			// 1, 11, 21
			int end = currentPage*recordCnt;
			// 3. sql
			
			String memsql = 
					"select r, first_name, hire_date" 
							+ " from(select rownum r, first_name, hire_date" 
							+ "	from (select  first_name, hire_date "
							+ " from EMPLOYEES order by hire_date desc)" 
							+ " 	)"
							+ " )" 
							+ " where r >= ? and r <= ?"; 

			PreparedStatement st = con.prepareStatement(memsql);
			st.setInt(1, start);
			st.setInt(2, end);
			rs = st.executeQuery();
			ArrayList<String> list = new ArrayList<String>();

			//5. 실행 - 출력
			while(rs.next()) { //한 레코드
				int rownum = rs.getInt("r");
				String name = rs.getString("first_name");
				String hire_date = rs.getString("hire_date");


				list.add
				(rownum + " : " +name + " : " + hire_date);
			}//while end

		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar 파일이 없거나 클래스명을 확인해주세요.");
		} catch (SQLException e) {
			// oracle 수동 시작 설정이면 연결 안 될 가능성 있음...
			// 문법, 제약조건 등 의 
			System.out.println("연결 정보를 확인하세요"); // connection con객체 생성문장에 문제가 생긴 경우
			e.printStackTrace();
		} finally {
			try {
				///////////////////5. 연결 해제
				System.out.println("db 연결 해제");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

