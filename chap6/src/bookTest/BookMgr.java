package bookTest;

public class BookMgr {

	Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

		public void printBookList() {
			for(int i = 0; i < booklist.length; i++)
				System.out.println(booklist[i].getTitle());
		}

		public void printTotalPrice() {
			int sum = 0;

			for(int i = 0; i < booklist.length; i++)
				sum += booklist[i].getPrice();
			
			System.out.println(sum);
		}



}
