package org.testngbasics;

import org.frameworkbaseclass.BaseClassForMethodCreation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg05CrossParallel extends BaseClassForMethodCreation{

	@Parameters({"Browser"})
	@Test
	private void browserLaunch(String browserName) {

		if(browserName.startsWith("fire")) {
			firefoxBrowser();
		}
		else if (browserName.equals("edge")) {
			edgeBrowser();
		}
		else {
			chromeBrowser();
		}
		
		maximizeWindow();
		launchUrl("https://www.facebook.com/");
		
	}
	
}
