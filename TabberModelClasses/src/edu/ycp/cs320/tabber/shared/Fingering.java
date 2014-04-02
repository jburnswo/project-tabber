package edu.ycp.cs320.tabber.shared;

import java.io.Serializable;

public class Fingering implements Serializable {
	private int string;
	private int fret;
	
	public Fingering(int string, int fret){
		this.string=string;
		this.fret=fret;
	}
	public int getstring(){
		return this.string;
	}
	public int getFret(){
		return this.fret;
	}
}
