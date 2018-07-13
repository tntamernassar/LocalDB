
public class Table {

	private String name;
	private Column[] columns;
	private LocalDB parentDB;
	private AVLTree[] trees;
	
	public Table(String name,Column[] columns) {
		this.name = name;
		this.columns = columns;
		trees = new AVLTree[this.columns.length];
		initTrees();
		this.parentDB = null;
	}
	
	public String Name() {
		return this.name;
	}
	
	public LocalDB LocalDB() {
		return this.parentDB;
	}
	
	public void setLocalDB(LocalDB DB) {
		this.parentDB = DB;
	}
	
	public void addRow(Row row) {
		int n = this.columns.length;
		Cell[] data = row.getData();
		for(int i=0;i<n;i++) {
			AVLTree T = this.trees[i];
			T.insert(new RowPointer(data[i].getData(), data[i].getparentRow()));
		}
	}

	public Row search(String alpha,Comperable RID) {
		int INDEX = search(alpha);
		
		if( INDEX == -1 )
			return null;
		
		AVLTree T = this.trees[INDEX];
		
		return T.search(RID) == null ? null : ((RowPointer)T.search(RID)).getRowPointer();		
	}
	
	private int search(String alpha) {
		int n = this.columns.length;
	
		for(int i=0;i<n;i++) {
			if(this.columns[i].getKey().equals(alpha)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private void initTrees() {
		int n = this.columns.length;
		
		for(int i=0;i<n;i++) {
			
			trees[i] = new AVLTree(columns[i].getComperator());
		}
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Table table = (Table)obj;
		
		return this.parentDB.equals(table.parentDB) &&
				this.name.equals(table.name);
	}

	
	
	
}
