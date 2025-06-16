package week3.day1;

public class AndroidPhone extends Smartphone {

	public void takeVideo() {
		System.out.println("Video capturing is enabled");
	}

	public static void main(String[] args) {
		AndroidPhone tasks = new AndroidPhone();
		tasks.takeVideo();
		tasks.sendSms();
		tasks.saveContact();
		tasks.makeCall();
		tasks.saveContact();
		tasks.accessWhatsapp();
	}

}
