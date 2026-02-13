package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PS {
	
	public void doThis() {
		System.out.println("I'm the parent class");
	}
	
	@BeforeTest
	public void beforeRun() {
		System.out.println("Run me first coming from Parent");
	}
	
	@AfterTest
	public void afterRun() {
		System.out.println("Run me last coming from Parent");
	}

}
