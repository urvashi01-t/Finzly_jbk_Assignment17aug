package liberaryManagement;

public class Book extends LiberaryItem {
	public Book(String tittle, int itemId,String author) {
		super(tittle, itemId);
		this.author= author;
		// TODO Auto-generated constructor stub
	}
	String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void displayInfo(String tittle, int itemId,String author) {
		System.out.println("tittle of book "+tittle);
		System.out.println("tittle of book "+itemId);
		System.out.println("tittle of book "+author);
	}
	public void reserveItem(LiberaryItem item) {
		
	}
}
