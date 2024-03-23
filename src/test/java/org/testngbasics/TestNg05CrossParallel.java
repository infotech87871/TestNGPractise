package org.testngbasics;

import org.frameworkbaseclass.BaseClassForMethodCreation;
import org.testng.annotations.Parameters;

public class TestNg05CrossParallel extends BaseClassForMethodCreation{

	@Parameters({"Browser"})
	public static void browserLaunch(String browserName) {

		if(browserName.startsWith("ch")) {
			chromeBrowser();
		}
		else if (browserName.equals("edge")) {
			edgeBrowser();
		}
		else {
			firefoxBrowser();
		}
		
	}
	
}
