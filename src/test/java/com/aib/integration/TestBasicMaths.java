
package com.aib.integration;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBasicMaths {

    @Test
    public void testConcatenate() {
       BasicMaths BasicMaths = new BasicMaths();

        String result = BasicMaths.concatenate("one","two");

        assertEquals("onetwo",result);

    }
}