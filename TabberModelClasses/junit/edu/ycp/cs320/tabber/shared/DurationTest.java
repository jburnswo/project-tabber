package edu.ycp.cs320.tabber.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class DurationTest {
	private Duration eighth;
	private Duration quarter;
	private Duration half;
	private Duration whole;
	
	@Before
	public void setUp() throws Exception{
		eighth= new Duration(0.5);
		quarter= new Duration(1);
		half= new Duration(2);
		whole= new Duration(4);
	}
	@Test
	public void getBeatCountTest() {
		assertEquals(0.5, eighth.getBeatCount());
		assertEquals(1, quarter.getBeatCount());
		assertEquals(2, half.getBeatCount());
		assertEquals(4, whole.getBeatCount());
	}
}
