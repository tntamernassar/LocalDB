
public class RowPointer implements Comperable {

	private Comperable data;
	private Row pointer;
	
	public RowPointer(Comperable data,Row pointer) 
	{
		this.data = data;
		this.pointer = pointer;
	}
	
	
	public Comperable getData() {
		return this.data;
	}
	
	public Row getRowPointer() {
		return this.pointer;
	}
	
	
	@Override
	public Integer compareTo(Object obj) {
		// TODO Auto-generated method stub
		return data.compareTo(obj);
	}
	
	

}
