package org.sonatype.mhandbook;

import org.testng.annotations.Test;

@Test
public class SeriousComponentTest {

	@Test
	public void testSeriousness() throws Exception {
		assert SeriousComponent.testSeriousness("SAD");
		assert SeriousComponent.testSeriousness("SERIOUS");
		assert SeriousComponent.testSeriousness("CRAZY");
		assert !SeriousComponent.testSeriousness("FUNNY");
	}
}