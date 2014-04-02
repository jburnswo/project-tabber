package edu.ycp.cs320.tabber.shared;

import java.io.Serializable;

public class Duration implements Serializable {
	private double beatCount;
	
	public Duration(double duration){
		this.beatCount=duration;
	}
	public double getBeatCount(){
		return this.beatCount;
	}
}
