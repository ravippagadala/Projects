package parallel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class StepDefinitions {
	@Before
	public void setUp() {
		System.out.println("before scenario");
	}
	@After
	public void tearDown() {
		System.out.println("after scenario");
	}
	  @Given("Step from {string} in {string} feature file")
	    public void step(String scenario, String file) {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		  System.out.format("Thread ID - %2d - %s from %s feature file.\n",
	        Thread.currentThread().getId(), scenario,file);
	    }
}
