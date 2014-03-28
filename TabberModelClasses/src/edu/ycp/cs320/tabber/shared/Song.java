package edu.ycp.cs320.tabber.shared;

import java.util.ArrayList;

public class Song {
	private String name;
	private ArrayList<Measure> measures;
	
	public Song(String name, Measure measure){
		this.name=name;
		this.measures.add(measure);
	}
	public String getName(){
		return this.name;
	}
	public void addMeasure(Measure measure){
		this.measures.add(measure);
	}
}
