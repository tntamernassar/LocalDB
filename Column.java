
public class Column {
	
	private String key;
	private Comperator comperator;
	
	public Column(String key,Comperator comperator) {
		this.key = key;
		this.comperator = comperator;
	}
	
	public Comperator getComperator() {
		return this.comperator;
	}
	
	public String getKey() {
		return this.key;
	}
}
