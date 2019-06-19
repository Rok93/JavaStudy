/**
 * 1 2 3 
 * 4 5 6
 * @author Rok93
 * @version 1.0.0   2019-06-18
 *
 */

public class TwoDimArrayTest {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];

		int num = 1;
		
		//이차원배열 (int type) : 자동 초기화값 0 저장
		for(int i = 0 ; i < arr.length; i ++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j] + " ");
			}
				System.out.println();
		}

		System.out.println("일차원 배열안에서 일차원배열 생성 (일정하지 않은 이차원 배열)");
		/*
		 * 1 2
		 * 3 4 5
		 * 6 7 8 9
		 */
		num = 1;
		int arr2[][] = new int[3][]; 
		System.out.println(arr2.length); //3

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new int[i+2];
			for ( int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num++;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
