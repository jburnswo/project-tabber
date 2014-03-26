package edu.ycp.cs320.tabber.shared;

import java.util.ArrayList;

public class Song {
	private String name;
	private Instrument instrument;
	private ArrayList<String> notes;
	private String[][] tab;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void createNoteProgression(){
		
	}
	public void createTab(){
		for(int i=0;i<notes.size();i++){
			if(notes.get(i)=="A"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="-";
					tab[i][3]="0";
					tab[i][4]="-";
				}
			}
			if(notes.get(i)=="B"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="-";
					tab[i][3]="2";
					tab[i][4]="-";
				}
			}
			if(notes.get(i)=="C"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="-";
					tab[i][3]="3";
					tab[i][4]="-";
				}
			}
			if(notes.get(i)=="D"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="0";
					tab[i][3]="-";
					tab[i][4]="-";
				}
			}
			if(notes.get(i)=="E"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="-";
					tab[i][3]="-";
					tab[i][4]="0";
				}
			}
			if(notes.get(i)=="F"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="-";
					tab[i][3]="-";
					tab[i][4]="1";
				}
			}
			if(notes.get(i)=="G"){
				if(instrument.getNumStrings()==6){
					tab[i][1]="";
					tab[i][2]="";
					tab[i][3]="";
					tab[i][4]="";
					tab[i][5]="";
					tab[i][6]="";
				}
				if(instrument.getNumStrings()==4){
					tab[i][1]="-";
					tab[i][2]="-";
					tab[i][3]="-";
					tab[i][4]="3";
				}
			}
		}
	}
}
