package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	public static ExtentReports extent;
	public static ExtentTest scenarioTest;
	
	
	
	@BeforeAll
	public static void setExtentReport() {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("talekar_ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter); }
		
		
		
		@Before
		public static void createTest(Scenario scenario) {
			scenarioTest= extent.createTest(scenario.getName());
			
		}
		
		
		
		@AfterAll
		public static void teardownExtentreport() {
			extent.flush();
			
		}
		
		
		
		
		
	

}
