package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	/*
	@Before(order=1)
	public void setup_browser(Scenario sc) {
		System.out.println("Launch Chrome browser");
		System.out.println(sc.getName());
		System.out.println(sc.getStatus());
}
	
	@Before(order=2)
	public void setup() {
		System.out.println("Launch url");
}
	
	@After(order=2)
	public void tearDown_close(Scenario scenario) {
		System.out.println("Closing browser");
		System.out.println(scenario.getName());
		System.out.println(scenario.getStatus());
	}
	@After(order=1)
	public void tearDown_logout() {
		System.out.println("Log out");
	}
	*/
	
	@BeforeStep
	public void takeSS() {
		System.out.println("Take SS");
	}
	
	@AfterStep
	public void refresh() {
		System.out.println("Refresh");
	}
	@Before("@Smoke")
	public void setup() {
		System.out.println("Launch url");
}
	
	@After("@Reg")
	public void tearDown_close() {
		System.out.println("Closing browser");
		
	}
}
