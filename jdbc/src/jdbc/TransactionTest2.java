package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionTest2 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 외부다른라이브러리등록
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.30.28:1521:xe", "hr", "hr");
			System.out.println("db 연결 성공");

			con.setAutoCommit(false);
			//System.out.println(con.getAutoCommit());

			Scanner sc = new Scanner(System.in);
			String cart = sc.nextLine();
			String carts[] = cart.split(" ");
			//carts[0]:hr  carts[1]:구입물건id
			//carts[2]:구입수량 carts[3] : 장바구니테이블 pay

			//product테이블존재여부
			String sql1 = 
					"select * from product where id=?";
			
			//product 테이블에서 해당 id 상품의 amount 구입량만큼 감소
			String sql2 = 
					"update product set amount = amount - ? "
							+ " where id=?";
			//cart 테이블에 해당 memberid, productid, amount 추가(insert)
			
			String sql3 = 
					"insert into " + carts[3] + " values (?,?,?)" ;		
			// member: memberid, name, email, 
			// product name, price, 
			// cart 구입수량

			String sql4 = 
					"select m.memberid mid, m.name mname, email, p.name pname, "
							+ "price, c.amount amo"
							+ " from member m, product p, cart c"
							+ " where c.memberid=? and "
							+ " m.memberid=c.memberid and"
							+ " p.id=c.productid";

			PreparedStatement pt =
					con.prepareStatement(sql1);
			pt.setInt(1, Integer.parseInt(carts[1]));
			ResultSet rs = pt.executeQuery();
			
			//hr 1 2 cart
			if(rs.next()) {
				pt = con.prepareStatement(sql2); 
				pt.setInt(1, Integer.parseInt(carts[2]));
				pt.setInt(2, Integer.parseInt(carts[1]));
				pt.executeUpdate();//commit/rollback 미정
				pt = con.prepareStatement(sql3);
				pt.setString(1, carts[0]);//memberid
				pt.setInt(2, Integer.parseInt(carts[1]));//productid
				pt.setInt(3, Integer.parseInt(carts[2]));
				pt.executeUpdate();	//예외-CATCH이동
				con.commit();
				//SQL4
				pt = con.prepareStatement(sql4);
				pt.setString(1, carts[0]);
				ResultSet rs2 = pt.executeQuery();
				con.commit();
				while(rs2.next()) {
					String memberid = rs2.getString("mid");
					String membername = rs2.getString("mname");
					String email = rs2.getString("email");
					String productname = rs2.getString("pname");
					
					int price = rs2.getInt("price");
					int amount = rs2.getInt("amo");
					
					System.out.println("memberid=" + memberid);
					System.out.println("membername=" + membername);
					System.out.println("email=" + email);
					System.out.println("productname=" + productname);
					System.out.println("price=" + price);
					System.out.println("구입수량=" + amount);
				}
			}
			else {
				System.out.println("해당 상품은 없습니다.");
			}
		}catch(ClassNotFoundException e) {
			System.out.println
			("ojdbc6.jar 없거나 클래스명 확인하세요");
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
				System.out.println("해당 테이블은 장바구니가 아닙니다.롤백됩니다.");
			}catch(SQLException e2) {
				e.printStackTrace();
			}
			//System.out.println("연결정보를 확인하세요");
			//e.printStackTrace();
		}finally {
			try {
				con.close();//:throws SQLException
			}catch(SQLException e) {   }
			System.out.println("db 연결 해제");
		}
	}
}
