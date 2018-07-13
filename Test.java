
public class Test {

	//Managing the DB still in progress
	//Adding DB,table,column,row will be easier and faster 
	
	public static void main(String[] args) {
		
		boolean test1,test2,test3;
		
		
		//Creating the dataBase
		LocalDB DB = new LocalDB("SocialWebsite");
		
		//Creating the Columns
		Column c1 = new Column("id",new IntegerComperator());
		Column c2 = new Column("username",new StringComperator());
		Column c3 = new Column("password",new StringComperator());
		Column[] columns = {c1,c2,c3};
		
		//Creating the Table
		Table users = new Table("users",columns);
		
		//Adding the Table to the DB
		DB.addTable(users);
		
		boolean b1,b2;
		b1 = DB.ContainsTable("users");
		b2 = DB.ContainsTable("Cool Table");
		
		if(b1 && !b2) 
			test1 = true;
		else
			test1 = false;
		
		//Creating The Row 
		Row r1 = new Row(columns);
		
		//Creating the Row Cells
		Cell d1 = new Cell(new ComparableInteger(1),r1);
		Cell d2 = new Cell(new ComparableString("tntamernassar"),r1);
		Cell d3 = new Cell(new ComparableString("SomeDummyPass123"),r1);
		Cell[] cells = {d1,d2,d3};
		
		//setting the data for r1
		r1.setData(cells);
		//add cells to the row
		users.addRow(r1);
		
		//Searching for existing password
		Row t1 = users.search("password", new ComparableString("SomeDummyPass123"));
		
		//Searching for unexisting id
		Row t2 = users.search("id", new ComparableInteger(2));
		
		if(t1 != null && t1.getData()[2].getData().toString().equals("SomeDummyPass123") && t2 == null)
			test2 = true;
		else
			test2 = false;
		
		//Deleting Table 'users' 
		DB.deleteTable("users");
		
		boolean contains = DB.ContainsTable("users");
		
		if(!contains) 
			test3 = true;
		else 
			test3 = false;
		
		
		if(test1 && test2 && test3)
			System.out.println("TEST PASSED :D");
		else
			System.out.println("Test Failed :(");
		
		
		
	}

}
