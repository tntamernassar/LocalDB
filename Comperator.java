
public interface Comperator {

	/**
	 * @param Object o1,o2 => objects to compare to
	 * @return x , Integer Such That : 
	 *             x = 0 , if o1 equals to o2
	 *             x > 0 , if o1 > o2
	 *             x < 0 , if o1 < o2
	 *             null , if they cannot be compared
	 * **/
	public Integer compareTo(Object o1,Object o2);
	
	
}
