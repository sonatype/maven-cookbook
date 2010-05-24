package org.sonatype.mcookbook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;

public class FibTest {

	private Selenium selenium;

	@BeforeClass
	public void startSelenium() {
		this.selenium = new DefaultSelenium("localhost", 4444, "*safari",
				"http://localhost:8080");
		this.selenium.start();
	}

	@Test public void testSequence() throws Exception {
		selenium.open("/sample-web/");
		selenium.type("index", "10");
		selenium.click("//input[@value='Calculate']");
		selenium.waitForPageToLoad("30000");
		assert selenium.isTextPresent("55");
	}
	
	@AfterClass(alwaysRun = true)
	public void stopSelenium() {
		this.selenium.stop();
	}

}
