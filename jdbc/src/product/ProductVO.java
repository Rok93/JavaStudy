package product;

public class ProductVO {

	private int id; //db product테이블 id컬럼 매핑변수  (컬럼이름과 변수이름을 동일하게 주는게 좋다) 
	// jsp, spring(자동 id 변수 -- id컬럼 매핑)
	private String name;
	private double price;
	private int amount;
	private String description;
	
	
	ProductVO(){} //기본생성자 생성 
	
	public ProductVO(int id, String name, double price, int amount, 
			String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", price=" + price 
				+ ", amount=" + amount + ", description=" + description + "]";
	}
	
		//현재객체 모든 변수값
	
}
