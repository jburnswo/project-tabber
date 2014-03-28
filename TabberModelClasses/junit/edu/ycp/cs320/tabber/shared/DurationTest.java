package edu.ycp.cs320.tabber.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class DurationTest {

	private static final double DELTA = 0.000001;
	
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
		assertEquals(0.5, eighth.getBeatCount(), DELTA);
		assertEquals(1, quarter.getBeatCount(), DELTA);
		assertEquals(2, half.getBeatCount(), DELTA);
		assertEquals(4, whole.getBeatCount(), DELTA);
	}
}
