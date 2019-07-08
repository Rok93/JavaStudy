package product;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		try {
			ArrayList<ProductVO> list = dao.getList();
			for(ProductVO vo : list) {
				System.out.println(vo);
				// id-name-price-amount-description 형식 출력 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
