
public class IntegerComperator implements Comperator {

	@Override
	public Integer compareTo(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		ComparableInteger s1 = (ComparableInteger)o1;
		ComparableInteger s2 = (ComparableInteger)o2;
		
		
		return s1.compareTo(s2);
	}
}
