package jdbc;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UDPJdbcReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(9999); //문패, port가 있다는건 수신하겠다! 없으면 리시버
		System.out.println("수신 시작");
		
		
//		Sender가 보낸 메시지
//		String msg = "폭염 주의하세요.";//2바이트 이상의 한글을 unicode사용
//		byte[] b = msg.getBytes();//한글이반드시 유니코드가 아니므로(컴마다다름) 바이트로 보내야 함!
//		DatagramPacket p = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 9999);
		
		
		// 보낸패킷 저장용 패킷 생성
		DatagramPacket p = new DatagramPacket(new byte[100], 100);
		ds.receive(p);
		System.out.println("수신 종료");
		///////////////// 수신 완료 ////////////////////
		
		System.out.println("데이터 출력");
		String msg = new String(p.getData(), 0, p.getLength());
		System.out.println("데이터 출력 : " + msg);
		System.out.println("발신컴퓨터IP=" + p.getAddress());
		System.out.println("발신컴퓨터PORT=" + p.getPort()); //랜덤포트
		InetAddress me = InetAddress.getLocalHost();
		System.out.println("내컴퓨터IP=" + me.getHostAddress());//ip
		
		///////////DB저장/////////////
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//외부에 있는 다른라이브러리 등록
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbc", "jdbc");
			System.out.println("\ndb 연결 성공 (자동 commit)");

			Statement st = con.createStatement();
			String memsql = "insert into udphistory values('" + me.getHostAddress() 
				+ "', '" + msg + "', sysdate)";
			int insertrow = st.executeUpdate(memsql);
			System.out.println(insertrow + "개의 행이 삽입되었습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar 파일이 없거나 클래스명을 확인해주세요.");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("db 연결 해제");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		ds.close();
	}

}
