package week3.day1;

public class Smartphone extends Mobile {

	public void accessWhatsapp() {
		System.out.println("Whatsapp is available in Smartphone");
	}

	public static void main(String[] args) {

		Smartphone functions = new Smartphone();
		functions.accessWhatsapp();
		functions.saveContact();
		functions.makeCall();
		functions.sendSms();
	}

}
