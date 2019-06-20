 
class Sorting{
	
	int[] ar = new int[5];
	
	Sorting(int[] ar) {
		this.ar = ar;
	}

	int[] sort() {
		//ar 필드변수 저장 5개 정수 : 오름차순 정렬
		//결과 리턴
		for(int i = 0; i < ar.length; i ++)
			for(int j = i+1; j < ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		return ar;
	}
	
}

public class SortTest {

	public static void main(String[] args) {
		//run 커맨드라인 입력: 88 66 55 10 2
		//입력받은 5개 정수를 mainArr에 저장
		// 객체 내부 ar 배열값 초기화

		int[] mainArr = new int[5];
		
		for(int i = 0; i < args.length; i++)
			mainArr[i] = Integer.parseInt(args[i]);
		
		Sorting s = new Sorting(mainArr);
		
		int[] result = s.sort();
		
		for(int i : result)
			System.out.print(i + " ");
		
		
	}

}
