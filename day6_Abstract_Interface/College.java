package day6_Abstract_Interface;

public class College extends University{
	
	@Override
	public void ug() {
System.out.println("This is UG");		
	}
	
	@Override
	public void pg() {
		System.out.println("This is PG");		
		super.pg();
	}
	
	

	public static void main(String[] args) {
		
		College Coll = new College();
		Coll.ug();
		Coll.pg();

		
	}

}
