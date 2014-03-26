package edu.ycp.cs320.tabber.shared;

public abstract class Instrument {
	private int numStrings;
	
	public Instrument(int numStrings){
		this.numStrings=numStrings;
	}
	public void setNumStrings(int numStrings){
		this.numStrings=numStrings;
	}
	
	public int getNumStrings(){
		return this.numStrings;
	}
}
