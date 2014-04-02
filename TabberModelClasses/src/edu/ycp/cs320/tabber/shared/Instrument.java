package edu.ycp.cs320.tabber.shared;

import java.io.Serializable;

public class Instrument implements Serializable {
	private int numStrings;
	
	
	public void setNumStrings(int numStrings){
		this.numStrings=numStrings;
	}
	
	public int getNumStrings(){
		return this.numStrings;
	}
}