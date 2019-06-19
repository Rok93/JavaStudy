public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 127;
		byte b2 = -128;

		System.out.println("바이트최소값 = " + b2);
		System.out.println("바이트최대값 = " + b1);

		// 내장 클래스 = api 라이브러리 
		// 각 데이터 타입별 최대, 최소값 내장 클래스 저장 
		System.out.println("바이트최소값(api) = " + Byte.MIN_VALUE);
		System.out.println("바이트최대값(api) = " + Byte.MAX_VALUE);
		
		//short type
		System.out.println("short최대값(api) = " + Short.MAX_VALUE);
		System.out.println("short최소값(api) = " + Short.MIN_VALUE);
		
		//int type
		System.out.println("int최대값(api) = " + Integer.MAX_VALUE);
		System.out.println("int최소값(api) = " + Integer.MIN_VALUE);
		
		//double type
		System.out.println("double최대값(api) = " + Double.MAX_VALUE);
		System.out.println("double최소값(api) = " + Double.MIN_VALUE);
	}
}
