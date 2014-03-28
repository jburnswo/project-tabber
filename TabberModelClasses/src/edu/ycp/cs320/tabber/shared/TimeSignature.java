package edu.ycp.cs320.tabber.shared;

public class TimeSignature {
	private int beatCount;
	private int numBeats;
	
	public TimeSignature(int beatCount, int numBeats){
		this.beatCount=beatCount;
		this.numBeats=numBeats;
	}
	public int getBeatCount(){
		return this.beatCount;
	}
	public int getNumBeats(){
		return this.numBeats;
	}
}
