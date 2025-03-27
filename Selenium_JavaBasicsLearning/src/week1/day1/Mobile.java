package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Making a call!");

	}

	public void sendMsg() {
		System.out.println("Sending a message!");
	}

	public static void main(String[] args) {
		Mobile mobileFunction = new Mobile();

		mobileFunction.makeCall();
		mobileFunction.sendMsg();
	}

}
