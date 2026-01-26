package utility;

import java.util.Collections;

import org.testng.TestNG;

public class DynamicSuite_surefire {
	
	
	public DynamicSuite_surefire() {
	TestNG testng = new TestNG();

    // Read suite file from system property, fallback to default
	
	
    String suiteFile = System.getProperty("suiteXmlFile", "suiteXmlFile");

    System.out.println("Running TestNG suite: " + suiteFile);

    testng.setTestSuites(Collections.singletonList(suiteFile));
    testng.run();
	}

}
