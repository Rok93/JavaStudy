package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {

	public ArrayList<ProductVO> getList() throws Exception{
		
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		//LIST SELECT 저장
		Class.forName("oracle.jdbc.driver.OracleDriver");  //예외 처리 try catch 구문 혹은 throws 로 떠넘기기
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		PreparedStatement pt = 
				con.prepareStatement("select * from product");
		
		ResultSet rs = pt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double price = rs.getDouble("price");
			int amount = rs.getInt("amount");
			String desc = rs.getString("description");
			
//			** ProductVO 가 기본생성자를 가지는 경우 ! 이렇게 처리 가능
//			ProductVO vo = new ProductVO();
//			vo.setId(id);
//			vo.setName(name);
//			vo.setPrice(price);
//			vo.setAmount(amount);
//			vo.setDescription(desc);
			
			// 이렇게 한방에 처리도 가능 (생성자로 한번에 대입할 수 있게)
			ProductVO vo = new ProductVO(id, name, price, amount, desc);
			list.add(vo);
			
		}
		System.out.println(list.size());
		con.close();
		return list;
		
	}
}
