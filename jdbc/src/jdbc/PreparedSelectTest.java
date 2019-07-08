package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PreparedSelectTest {

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
			/////////////////////1. jdbc driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");//외부에 있는 다른라이브러리 등록
			/////////////////////2. db 정보에 맞는 db 연결
			//connection은 인터페이스로 객체 생성 불가능 => 드라이버 불러와서 사용
			//jdbc:oracle:thin: 까지는 동일 / @localhost:1521:xe 이부분 바뀜
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "hr");
			System.out.println("db 연결 성공 (자동 commit)");
			System.out.println(con.getAutoCommit());

			// 키보드 입력 : london 근무 사원
			Scanner sc = new Scanner(System.in);
			String data = sc.next();

			//			- employees 테이블 / departments 테이블 / locations 테이블 
			//			london 지역 근무 사원의 사원명, 입사월(년도 2/월 2), 급여, 부서명, 도시명 조회

			String memsql = 
					"select first_name, to_char(hire_date, 'yy/mm') indate,"
							+ " salary, department_name, city "
							+ "from employees e, departments d, locations l"
							+ " where e.department_id = d.department_id"
							+ " and d.location_id = l.location_id"
							+ " and lower(l.city) = ?";

			PreparedStatement st = con.prepareStatement(memsql);
			st.setString(1, data.toLowerCase());
			rs = st.executeQuery();
			ArrayList<String> list = new ArrayList<String>();
			
			
			//5. 실행 - 출력
			while(rs.next()) { //한 레코드
				String name = rs.getString("first_name");
				String hiredate = rs.getString("indate");
				Double salary = rs.getDouble("salary");
				String d_name = rs.getString("department_name");
				String city = rs.getString("city");
				
				System.out.println
				(name + ":" + hiredate + ":" + salary +
						":" + d_name + ":" + city);
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
		
//		try {
////			for(String st : list) {
////				System.out.println(st);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
		
	}
}
