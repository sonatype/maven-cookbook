package org.sonatype.mhandbook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;

public class TwitterTest {

	private Selenium selenium;

	@BeforeClass
	public void startSelenium() {
		this.selenium = new DefaultSelenium("localhost", 4444, "*safari",
				"http://www.twitter.com");
		this.selenium.start();
	}

	@Test
	@Parameters( { "user", "name" })
	public void testReddit(String user, String name) {
		try {
			selenium.open("http://www.twitter.com/" + user);
			selenium.waitForPageToLoad("3000");
			assert selenium.isTextPresent(name);

		} catch (SeleniumException e) {
			throw e;
		}
	}

	@AfterClass(alwaysRun = true)
	public void stopSelenium() {
		this.selenium.stop();
	}

}
