package edu.ycp.cs320.tabber.shared;

public class Fingering {
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
