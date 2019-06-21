package kitri.system;

public class MyList{

	private String name;//디렉토리나 파일 이름
	private int size;//파일의 크기

	public MyList() {
		super();
	}

	public MyList(String name) {
		super();
		this.name = name;
	}

	public MyList(int size) {
		super();
		this.size = size;
	}

	public MyList(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void print(){   
		
	}
}