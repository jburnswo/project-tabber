package edu.ycp.cs320.tabber.shared;

public class Duration {
	private double beatCount;
	
	public Duration(double duration){
		this.beatCount=duration;
	}
	public double getBeatCount(){
		return this.beatCount;
	}
}
