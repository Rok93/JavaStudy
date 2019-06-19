
public class StarTest {

	public static void main(String[] args) {

		char[][] c = new char[5][4];
		
		System.out.println("예제 1번 ) ");

		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = '*';
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}


		char[][] c2 = new char[5][];

		System.out.println("예제 2번 ) ");
		
		for(int i = 0; i < c.length; i++) {
			c2[i] = new char[i+1];
			for(int j = 0; j < c2[i].length; j++) {
				c2[i][j] = '*';
				System.out.print(c2[i][j] + " ");
			}
			System.out.println();
		}

		
		char start = 'a';
		char[][] c3 = new char[3][];
		
		System.out.println("예제 3번 ) ");
		
		for(int i = 0; i < c3.length; i++) {
			c3[i] = new char[i+1];
			for(int j = 0; j < c3[i].length; j++) {
				c3[i][j] = start++;
				// start = (char) (start + 1); 
				System.out.print(c3[i][j] + " ");
			}
			System.out.println();
		}
	}

}