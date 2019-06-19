
public class ArrayCopy {

	public static void main(String[] args) {

		String[] s1 = {"oracle" , "java" , "html5" , "jquery" };
		String[] s2 = new String[8];
		
		//s2 배열에 s1의 배열을 복사
		//s2 = s1;  원하는 것 처럼 배열 복사가 안된다!   
		System.arraycopy(s1, 0, s2, 0, s1.length);
		//scr는 원본 , desc는 사본 
		
		System.out.println("===복사이후의 s2===");
		for(String st : s2)
			System.out.println(st);
		
	}

}
