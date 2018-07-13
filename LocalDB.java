import java.util.LinkedList;

public class LocalDB implements MemoryApplier {

	private String name;
	private LinkedList<Table> tables;
	
	public LocalDB(String name) {
		this.name = name;
		tables = new LinkedList<Table>();
	}
	
	public void addTable(Table table) {
		if(!tables.contains(table) ) {
			
			if(table.LocalDB() == null)
				table.setLocalDB(this);
				tables.add(table);
		}
	}  
	
	
	public boolean ContainsTable(String tableName) {
		Table toCheck = getTable(tableName);
		return toCheck==null?false:tables.contains(toCheck);
	}
	
	public Table getTable(String tableName) {
		for(Table t : tables) {
			if(t.Name().equals(tableName))
				return t;
		}
		return null;
	}
	
	
	public void deleteTable(String tableName) {
		Table toDelete = getTable(tableName);
		this.tables.remove(toDelete);
	}
	
	@Override
	public boolean equals(Object obj) {
		LocalDB DB = (LocalDB)obj;
		return DB.name.equals(this.name);
	}

	@Override
	public void updateMemory() {
		// TODO Auto-generated method stub
		
	}
}
