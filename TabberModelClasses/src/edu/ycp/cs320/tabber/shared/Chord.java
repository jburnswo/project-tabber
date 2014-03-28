package edu.ycp.cs320.tabber.shared;

import java.util.ArrayList;

public class Chord {
	private String name;
	private ArrayList<Note> notes;
	private Duration chordLength;
	
	public Chord(String name, Note note, Duration chordLength){
		notes= new ArrayList<Note>();

		this.name=name;
		this.notes.add(note);
		this.chordLength=chordLength;
	}
	public void addNote(Note note){
		this.notes.add(note);
	}
	public String getName(){
		return this.name;
	}
	public String getNotes(){
		String noteNames="";
		for(int i=0; i<this.notes.size();i++){
			noteNames=noteNames+this.notes.get(i).getName()+" ";
		}
		return noteNames;
	}
	public Duration getDuration(){
		return this.chordLength;
	}
}
