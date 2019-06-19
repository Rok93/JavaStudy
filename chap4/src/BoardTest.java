
public class BoardTest {

	public static void main(String[] args) {


		while(true) {

			int menu = (int) (Math.random() * 5) +1 ;
			
			System.out.print(menu + " : ");

			if(menu == 1) {
				System.out.println("게시물리스트보기를 선택하셨습니다.");
			}
			else if(menu == 2) {
				System.out.println("게시물작성을 선택하셨습니다.");
			}
			else if(menu == 3) {
				System.out.println("게시물수정을 선택하셨습니다.");
			}
			else if(menu == 4) {
				System.out.println("게시물삭제를 선택하셨습니다.");
			}
			else { // menu ==5 와 같은 의미 (menu 가 1~5 값 밖에 없음)
				System.out.println("게시물작업종료");
				break;
			}
		}
	}

}
