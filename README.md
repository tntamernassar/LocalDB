# LocalDB
LocalDB is used to store a data localy in the memory you have 
the programmer can implement the memory storing in Row.updateMemory() and LocalDB.updateMemory() 
### Time Anlysis
___________________

- Adding a Table => O(n)
		while n is the number of teh tables in the database
		
- Adding a row to a table => O(klog(n)) => O(log(n)) 
		while k is the number of columns in the table(Constant)
		n is the number of rows in the table
		=> O(log(n))
		
- Searching for a Row => O(log(n) + k)
		while n is the number of rows in the table
		while k is the number of columns in the table(Constant)
		=> O(log(n))
		
- Deleting for a Row => O(log(n) + k)
		while n is the number of rows in the table
		while k is the number of columns in the table(Constant)
		=> O(log(n))
