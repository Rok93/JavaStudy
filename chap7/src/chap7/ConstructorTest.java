package chap7;

class Parent /* extends Object */{
	
	double d1;
	
	Parent(double d){
		//super();
		System.out.println("Parent생성자호출");
		d1 = 1000.0;
	}
}

class Child extends Parent {
	double d2;
	Child(){
		super(3.14); //this() 같이 쓰인다.
		System.out.println("Child생성자호출");
		d2 = 100.0;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.d1);
		System.out.println(c.d2);
		
	}

}
