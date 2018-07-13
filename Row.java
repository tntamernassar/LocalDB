
public class Row implements MemoryApplier{

	
	private Column[] columns;
	private Cell[] data;
	
	public Row(Column[] columns,Cell[] data) {
		this.columns = columns;
		this.data = data;
	}
	
	public Row(Column[] columns) {
		this.columns = columns;
	}
	
	public void setData(Cell[] data) {
		this.data = data;
	}
	
	
	public Cell[] getData() {
		return this.data;
	}

	@Override
	public void updateMemory() {
		// TODO Auto-generated method stub
		
	}
}
