package edu.ycp.cs320.tabber.shared;

import java.util.ArrayList;

public class Measure {
	private ArrayList<Chord> chords;
	private TimeSignature time;
	
	public Measure(Chord chord, TimeSignature time){
		this.chords.add(chord);
		this.time=time;
	}
	public String getChords(){
		String chordNames="";
		for(int i=0; i<this.chords.size();i++){
			chordNames=chordNames+this.chords.get(i).getName()+" ";
		}
		return chordNames;
	}
	public TimeSignature getTimeSignature(){
		return this.time;
	}
	public void addChords(Chord chord){
		this.chords.add(chord);
	}
}
