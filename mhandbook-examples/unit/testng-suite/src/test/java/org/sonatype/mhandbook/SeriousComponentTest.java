package org.sonatype.mhandbook;

import org.testng.annotations.Test;

@Test
public class SeriousComponentTest {

	@Test(groups={"unit"})
	public void testSad() throws Exception {
		assert SeriousComponent.testSeriousness("SAD");
	}

	@Test(groups={"unit"})
	public void testSerious() throws Exception {
		assert SeriousComponent.testSeriousness("SERIOUS");
	}

	@Test(groups={"unit"})
	public void testCrazy() throws Exception {
		assert SeriousComponent.testSeriousness("CRAZY");
	}

	@Test(groups={"unit"})
	public void testFunny() throws Exception {
		assert !SeriousComponent.testSeriousness("FUNNY");
	}
	
	@Test(groups={"integration"})
	public void testLargeFile() throws Exception {
		String text = "TEST";
		// Imagine that this method contained some serious
		// code that loaded a 100k line text file and
		// tested each line.
		assert !SeriousComponent.testSeriousness(text);
	}
	
}