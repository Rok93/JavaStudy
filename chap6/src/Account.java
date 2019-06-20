//특정값 저장 용도 : 값 외부 은닉 변수 / public
public class Account {

	//getter/setter 메소드
	private int code;
	private int pw;
	private String name;
	private double balance;
	
	// 상단에 Source tap에서 generator getters and setters 
	//클릭해서 변수 체크하면 자동생성    -> IntelliJ 에서도 있는지 확인 ! 
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	
	
	

}
