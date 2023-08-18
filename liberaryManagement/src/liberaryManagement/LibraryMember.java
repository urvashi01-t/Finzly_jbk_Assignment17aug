package liberaryManagement;

public abstract class LibraryMember implements Reservable {
	int memberID;
	String name;
abstract void	borrowItem(LiberaryItem item);

}
