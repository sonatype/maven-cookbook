package org.sonatype.mcookbook;

import org.testng.annotations.Test;

@Test
public class SeriousComponentTest {

	@Test
	public void testSad() throws Exception {
		assert SeriousComponent.testSeriousness("SAD");
	}

	@Test
	public void testSerious() throws Exception {
		assert SeriousComponent.testSeriousness("SERIOUS");
	}

	@Test
	public void testCrazy() throws Exception {
		assert SeriousComponent.testSeriousness("CRAZY");
	}

	@Test
	public void testFunny() throws Exception {
		assert !SeriousComponent.testSeriousness("FUNNY");
	}
}