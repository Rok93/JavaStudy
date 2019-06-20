class Sum {
	void add (int ...i) { // 비정형 매개변수는 하나만 사용가능 (다른 타입 매개변수 하나?는 받을 수 잇는데, 
		//비정형 매개변수보다 먼저 선언해야한다 ! , 비정형 매개변수는 마지막에 선언하라 )
		System.out.println("전달받은 매개변수 갯수 = "+ i.length);
		int total = 0;
		for(int j = 1; j < i.length; j++ ) {
			total += i[j];
		}
		System.out.println("총합계 = " + total);
	}
}

public class VariableArgumentTest {

	public static void main(String[] args) {
		
		Sum s = new Sum();
		s.add(1,10);
		s.add(1,10,56,1,2 );
		s.add(1,2,3,4,5,6,7,8,9,10);
	}

}
