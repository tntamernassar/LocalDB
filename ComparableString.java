
public class ComparableString implements Comperable {

	private String data;
	
	public ComparableString(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	@Override
	public Integer compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		if(!(obj instanceof ComparableString)) {
			return null;
		}
		ComparableString toCompare = (ComparableString)obj;
		return data.compareTo(toCompare.data);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data.toString();
	}

}
