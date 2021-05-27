package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest
{
    public AppTest() {
    }

    @Test
    public void testApp()
    {
        // arrange
        App testAppInstance = new App();
        Integer a = 1;
        Integer b = 2;
        Integer expected = 3;

        // act
        Integer actual = testAppInstance.sum(a,b);
        
        // assert
        assertTrue( expected.equals(actual) );
    }
}
