package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		Connection con = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");//외부에 있는 다른라이브러리 등록
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", "hr");
			System.out.println("db 연결 성공 (자동 commit)");
			System.out.println(con.getAutoCommit());

			Scanner sc = new Scanner(System.in);
			String cart = sc.nextLine();
			String[] carts = cart.split(" ");
			//			carts[0] : hr  carts[1]: 구입물건id
			//			carts[2] : 구입수량 carts[3] : 장바구니테이블 pay

			String sql1 =
					"update product set amount = amount - ? "
							+ " where id=?";

			String sql2 =
					"update product set amount = amount - ? "
							+ " where id=?";

			//cart 테이블에 해당 memberid, productid, amount 
			String sql3 =
					"insert into " + carts[3] + " values (?,?,?)" ;
			//member : memberid, name, email
			//product name, price
			//cart 구입수량

			String sql4 =
					"select m.memberid mid, m.name mnaim, email, p.name pname, "
							+ "price, c.amount cmo"
							+ " from member m, product p , cart c"
							+ " where c.memberid = ? and "
							+ " m.memberid=c.memberid and"
							+ " p.id=c.productid" ;

			PreparedStatement pt =
					con.prepareStatement(sql1);

			pt.setInt(1, Integer.parseInt(carts[1]));
			ResultSet rs = pt.executeQuery();
			//hr 1 2 cart 

			if(rs.next()) {
				pt = con.prepareStatement(sql2); 
				pt.setInt(1, Integer.parseInt(carts[2]));
				pt.setInt(2,Integer.parseInt(carts[1])); //제품의 아이디
				pt.executeUpdate();// commit / rollback 미정

				pt = con.prepareStatement(sql3);
				//insert into " + carts[3] + " values (?,?,?)
				pt.setString(1, carts[0]); //memberid
				pt.setInt(2, Integer.parseInt(carts[1]));
				pt.setInt(3,Integer.parseInt(carts[2])); //제품의 아이디
				pt.executeUpdate();// 예외 - catch 이동 
				con.commit();

				pt = con.prepareStatement(sql4);
				pt.setString(1, carts[0]);
				pt.executeQuery();
				ResultSet rs2 = pt.executeQuery();

				while(rs.next()) {

					String memberid = rs2.getString("mid");
					String membername = rs2.getString("mname");
					String email = rs2.getString("email");
					String productname = rs2.getString("pname");
					int price = rs2.getInt("price");
					int amount = rs2.getInt("cmo");

					System.out.println("memberid = " + memberid);
					System.out.println("membername = " + membername);
					System.out.println("email = " + email);
					System.out.println("productname = " + productname);
					System.out.println("price = " + price);
					System.out.println("구입수량 = " + amount);
				}

			}
			else {
				System.out.println("해당 상품은 없습니다.");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar 파일이 없거나 클래스명을 확인해주세요.");

		} catch (SQLException e) {

			try {
				con.rollback();
				System.out.println("해당 테이블은 장바구니가 아닙니다. 롤백됩니다");
			}catch(SQLException e2) {
				e2.printStackTrace();
			}

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
