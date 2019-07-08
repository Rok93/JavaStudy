package jdbc;

import com.sun.jdi.connect.spi.Connection;

public class test {

	public static void main(String[] args) {
		try {
			Connection con;
			System.out.println("db 연결");
		}catch(Exception e) {
			
		}finally {
			System.out.println("db 연결해제");
		}
	}
}
