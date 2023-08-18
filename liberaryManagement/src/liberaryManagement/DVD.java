package liberaryManagement;

public class DVD  extends LiberaryItem implements Reservable

{
	public DVD(String tittle, int itemId) {
		super(tittle, itemId);
		// TODO Auto-generated constructor stub
	}
	double Duration;
	
	public double getDuration() {
		return Duration;
	}

	public void setDuration(double duration) {
		Duration = duration;
	}

	public void displayInfo() {
	
}
public void reserveItem(LiberaryItem item) {
		
	}
}
