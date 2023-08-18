package liberaryManagement;

public class LiberaryItem {
 protected String tittle;
	int itemId;
	public LiberaryItem(String tittle,int itemId) {
		this.tittle=tittle;
		this.itemId= itemId;
	}

public String getTittle() {
	return tittle;
}
public void setTittle(String tittle) {
	this.tittle = tittle;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public void displayInfo() {
	
}
}
