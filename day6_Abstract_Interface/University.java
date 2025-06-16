package day6_Abstract_Interface;

public abstract class University {
	
	public abstract void ug();
	
	public void pg() {
		System.out.println("This is PG");
	}

	public static void main(String[] args) {
	University pg = new University() {
		
			
		@Override
		public void ug() {
			
		}
	};
	}

}
