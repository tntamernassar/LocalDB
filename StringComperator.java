
public class StringComperator implements Comperator{

	@Override
	public Integer compareTo(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		ComparableString s1 = (ComparableString)o1;
		ComparableString s2 = (ComparableString)o2;
		
		
		return s1.compareTo(s2);
	}

}
