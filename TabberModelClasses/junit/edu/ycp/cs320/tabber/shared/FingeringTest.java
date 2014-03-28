package edu.ycp.cs320.tabber.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class FingeringTest {
	private Fingering A;
	private Fingering B;
	private Fingering C;
	private Fingering E;
	
	@Before
	public void setUp() throws Exception{
		A= new Fingering(2,0);
		B= new Fingering(2,2);
		C= new Fingering(2,3);
		E= new Fingering(1,0);
	}
	@Test
	public void getStringTest() {
		assertEquals(2, A.getstring());
		assertEquals(2, B.getstring());
		assertEquals(2, C.getstring());
		assertEquals(1, E.getstring());
	}
	@Test
	public void getFretTest(){
		assertEquals(0, A.getFret());
		assertEquals(2, B.getFret());
		assertEquals(3, C.getFret());
		assertEquals(0, E.getFret());
	}
}
