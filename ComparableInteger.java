
public class ComparableInteger implements Comperable {
	private Integer data;
	
	public ComparableInteger(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return this.data;
	}
	 
	@Override
	public Integer compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		if(!(obj instanceof ComparableInteger)) {
			return null;
		}
		ComparableInteger toCompare = (ComparableInteger)obj;
		return data.compareTo(toCompare.data);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data+"";
	}

}
