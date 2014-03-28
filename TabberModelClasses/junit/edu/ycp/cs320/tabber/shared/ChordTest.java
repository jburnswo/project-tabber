package edu.ycp.cs320.tabber.shared;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ChordTest {
	private static final double DELTA = 0.000001;
	
	private Chord A;
	private Chord B;
	private Chord C;
	private Chord E;
	private Note a;
	private Note b;
	private Note c;
	private Note d;
	private Note e;
	private Note f;
	private Note g;
	private Note test;
	private Fingering fa;
	private Fingering fb;
	private Fingering fc;
	private Fingering fd;
	private Fingering fe;
	private Fingering ff;
	private Fingering fg;
	private Duration quarter;
		
	@Before
	public void setUp() throws Exception{
		fa= new Fingering(2,0);
		fb= new Fingering(2,2);
		fc= new Fingering(2,3);
		fd= new Fingering(2,5);
		fe= new Fingering(1,0);
		ff= new Fingering(1,1);
		fg= new Fingering(1,3);
		a= new Note("A",fa);
		b= new Note("B",fb);
		c= new Note("C",fc);
		d= new Note("D",fd);
		e= new Note("E",fe);
		f= new Note("F",ff);
		g= new Note("G",fg);
		test= new Note("A", fa);
		quarter= new Duration(1);
		A= new Chord("A", a, quarter);
		B= new Chord("B", b, quarter);
		C= new Chord("C", c, quarter);
		E= new Chord("E", e, quarter);
		A.addNote(c);
		A.addNote(e);
		B.addNote(d);
		B.addNote(f);
		C.addNote(e);
		C.addNote(g);
		E.addNote(g);
		E.addNote(b);
	}
	@Test
	public void getNameTest() {
		assertEquals("A", A.getName());
		assertEquals("B", B.getName());
		assertEquals("C", C.getName());
		assertEquals("E", E.getName());
	}
	@Test
	public void getDurationTest(){
		assertEquals(1, A.getDuration().getBeatCount(), DELTA);
		assertEquals(1, B.getDuration().getBeatCount(), DELTA);
		assertEquals(1, C.getDuration().getBeatCount(), DELTA);
		assertEquals(1, E.getDuration().getBeatCount(), DELTA);
	}
	@Test
	public void getNotesTest() {
		assertEquals("A C E ", A.getNotes());
		assertEquals("B D F ", B.getNotes());
		assertEquals("C E G ", C.getNotes());
		assertEquals("E G B ", E.getNotes());
	}
	@Test
	public void addNoteTest(){
		A.addNote(test);
		B.addNote(test);
		C.addNote(test);
		E.addNote(test);
		
		assertEquals("A C E A ", A.getNotes());
		assertEquals("B D F A ", B.getNotes());
		assertEquals("C E G A ", C.getNotes());
		assertEquals("E G B A ", E.getNotes());
	}
}
