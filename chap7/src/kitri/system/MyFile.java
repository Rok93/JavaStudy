package kitri.system;

public class MyFile extends MyList{

	int extension;

	@Override
	public void print(){
		System.out.println("File 이름 : " + super.getName());
		System.out.println("File 길이 : " + super.getSize()+ " 바이트");
	}

	public MyFile(){   
		
		super(getName(), getSize());
	}
}
