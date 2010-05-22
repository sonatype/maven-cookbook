package org.sonatype.mhandbook;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class SeriousComponentTest {

	@Parameters({"databaseHostname"})
	@Test
	public void testSeriousness(String databaseHostname) throws Exception {
		assert SeriousComponent.testSeriousness("SAD");
		assert SeriousComponent.testSeriousness("SERIOUS");
		assert SeriousComponent.testSeriousness("CRAZY");
		assert !SeriousComponent.testSeriousness("FUNNY");
		System.out.println( "Database Hostname: " + databaseHostname );
	}
}