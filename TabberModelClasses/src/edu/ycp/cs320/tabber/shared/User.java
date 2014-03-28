package edu.ycp.cs320.tabber.shared;

import java.util.ArrayList;

public class User {
	private String userName;
	private String email;
	private String passWord;
	private ArrayList<Song> savedSongs;
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setPassWord(String passWord){
		this.passWord=passWord;
	}
	public String getPassWord(){
		return this.passWord;
	}
	public void changeEmail(String email){
		this.setEmail(email);
	}
	public void changePassWord(String passWord){
		this.setPassWord(passWord);
	}
	public void saveSong(Song songToSave){
		this.savedSongs.add(songToSave);
	}
}
