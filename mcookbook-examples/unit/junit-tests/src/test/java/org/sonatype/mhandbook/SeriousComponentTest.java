package org.sonatype.mhandbook;

import junit.framework.TestCase;

public class SeriousComponentTest extends TestCase {

        public SeriousComponentTest(String name) {
                super( name );
        }

        public void testSeriousness() throws Exception {
                assertTrue( SeriousComponent.testSeriousness( "SAD" ) );
                assertTrue( SeriousComponent.testSeriousness( "SERIOUS" ) );
                assertTrue( SeriousComponent.testSeriousness( "CRAZY" ) );
                assertTrue( !SeriousComponent.testSeriousness( "FUNNY" ) );
        }
}