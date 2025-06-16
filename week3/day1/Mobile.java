package week3.day1;

import org.openqa.selenium.devtools.v131.profiler.model.FunctionCoverage;

public class Mobile {

	public void sendSms() {
		System.out.println("Sending SMS to ");

	}

	public void makeCall() {
		System.out.println("Calling . . ");
	}

	public void saveContact() {

		System.out.println("Contact saving/ saved as ");
	}

	public static void main(String[] args) {

		Mobile mobilefunctions = new Mobile();
		mobilefunctions.sendSms();
		mobilefunctions.makeCall();
		mobilefunctions.saveContact();

	}

}
