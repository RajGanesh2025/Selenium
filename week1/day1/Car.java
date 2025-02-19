package week1.day1;

//accessmodifiers keyword className
public class Car {
	
	/*Use contrl+space+enter button to create method
	 * ex:driveCar is the method name. 
	 * To create a method, type the method name, then press ctrl+space+enter button
	 * Rename the access modifier from private to public
	*/
	
	public void driveCar() {
		
		//type syso and press ctrl+space+enter

		System.out.println("Bhavani has learned to drive the car");
	} 
	
	public void applyBrake() {
System.out.println("Brakes are applied!");
	}
	
		public static void main(String[] args) {
			//To create an object, syntax is className objectName = new className
			Car myCar = new Car();
			
			//use the object to call the method
			myCar.driveCar();
			myCar.applyBrake();
			
			//shortcut for execution/run the program is ctrl+F11
		}
}
