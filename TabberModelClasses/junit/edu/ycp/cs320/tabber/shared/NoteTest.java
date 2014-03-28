package edu.ycp.cs320.tabber.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class NoteTest {
	private Note A;
	private Note B;
	private Note C;
	private Note E;
	private Fingering a;
	private Fingering b;
	private Fingering c;
	private Fingering e;
	
	@Before
	public void setUp() throws Exception{
		a= new Fingering(2,0);
		b= new Fingering(2,2);
		c= new Fingering(2,3);
		e= new Fingering(1,0);
		A= new Note("A",a);
		B= new Note("B",b);
		C= new Note("C",c);
		E= new Note("E",e);
	}
	@Test
	public void getNameTest() {
		assertEquals("A", A.getName());
		assertEquals("B", B.getName());
		assertEquals("C", C.getName());
		assertEquals("E", E.getName());
	}
	@Test
	public void getFFingeringStringTest(){
		assertEquals(2, A.getFingering().getstring());
		assertEquals(2, B.getFingering().getstring());
		assertEquals(2, C.getFingering().getstring());
		assertEquals(1, E.getFingering().getstring());
	}
	@Test
	public void getFFingeringFretTest(){
		assertEquals(0, A.getFingering().getFret());
		assertEquals(2, B.getFingering().getFret());
		assertEquals(3, C.getFingering().getFret());
		assertEquals(0, E.getFingering().getFret());
	}
}
