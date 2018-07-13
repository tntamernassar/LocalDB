
public class Cell {

	private Comperable data;
	private Row parentRow;
	
	public Cell(Comperable data,Row parentRow) {
		this.data = data;
		this.parentRow = parentRow;
	}
	

	
	public Comperable getData() {
		return this.data;
	}
	
	public Row getparentRow() {
		return this.parentRow;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}
	
}
