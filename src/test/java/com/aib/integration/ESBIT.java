package com.aib.integration;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ESBIT {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void testPush() {
        ESBChat myUnit = new ESBChat();

        String result = myUnit.push("apple");

        assertEquals("onetwo", result);

    }



}
