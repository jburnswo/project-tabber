package edu.ycp.cs320.tabber.shared;

import java.io.Serializable;

public class Note implements Serializable {
	private String name;
	private Fingering fingering;
	
	public Note(String name, Fingering fingering){
		this.name=name;
		this.fingering=fingering;
	}
	public String getName(){
		return this.name;
	}
	public Fingering getFingering(){
		return this.fingering;
	}
}
