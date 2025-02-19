package week1.day1;

public class Variables {
	
	String mobileModel = "Samsung";
	int mobileWeight = 132;
	boolean isFullCharge= true;
	double mobileCost= 43876.23;
	

	public static void main(String[] args) {
		Variables mobiles= new Variables();
		System.out.println(mobiles.mobileCost);
		System.out.println(mobiles.isFullCharge);
		System.out.println(mobiles.mobileModel);
		System.out.println(mobiles.mobileWeight);

	}

}
