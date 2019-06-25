package chap8;

public interface Worker {
	//생성자 없다, 필드와 메소드 정의 가능
	/*static final public */String name = "교직원";
	void work();  // public abstract 자동 생략 되었음.
	void lunch();
	
}
