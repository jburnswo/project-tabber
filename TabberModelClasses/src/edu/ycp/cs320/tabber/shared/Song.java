package edu.ycp.cs320.tabber.shared;

import java.io.Serializable;
import java.util.ArrayList;

public class Song implements Serializable {
	// TODO:
	// private int id;      // the song's unique id
	// private int userId;  // the user that "owns" the song
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
