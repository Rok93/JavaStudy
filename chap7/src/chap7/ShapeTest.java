package chap7;


abstract class Shape{ // 면적, 둘레 메소드 공통 존재 명세
	abstract void area();
	abstract void circum();
}

class Circle extends Shape{
	//반지름 필드
	//반지름 필드를 초기화하는 생성자
	//abstract 메소드 2개 상속 오버라이딩 구현

	int radius ;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("반지름이 " + radius + " 인 원의 면적 = " 
				+ (radius * radius * 3.14) );
	}

	@Override
	void circum() {
		System.out.println("반지름이 " + radius + " 인 원의 둘레 = " 
				+ (radius * 2 * 3.14) );
	}



}

class Rectangle extends Shape{
	int width; // 가로
	int height; // 세로
	//가로 , 세로 초기화하는 생성자 정의 
	//area, circum() 오버라이딩 
	//가로 x, 세로 x 인 사각형의 면적 = xxx
	
	Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	void area() {
		System.out.println("가로 " + width + " 세로 " + height + " 인 사각형의 면적 = "
				+ (width * height));
	}
	@Override
	void circum() {
		System.out.println("가로 " + width + " 세로 " + height + " 인 사각형의 둘레 = "
				+ ((width * 2) + (height * 2)));
	}

	
}


public class ShapeTest {
	public static void main(String[] args) {
		/*
		 *  입력변수 circle 5 
		 *  ==> 반지름 5인 원, Circle 객체, 면적, 둘레 계산
		 *  입력변수 rect 6 8 
		 *  ==> 가로 6, 세로 8인 사각형, Rectangle 객체, 면적, 둘레 계산
		 *  1> 면적과 둘레 메소드 Circle, Rectangle 클래스 공통
		 */
		if(args.length == 2 && args[0].equals("circle")) {
			Circle c = new Circle(Integer.parseInt(args[1]));
			c.area();
			c.circum();
		}

		else if(args.length == 3 && args[0].equals("rect")) {
			Rectangle r = 
					new Rectangle(
							Integer.parseInt(args[1]),
							Integer.parseInt(args[2]) );
			r.area();
			r.circum();
		}
	}

}
