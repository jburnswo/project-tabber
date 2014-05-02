package edu.ycp.cs320.tabber.server.model.persist;

import edu.ycp.cs320.tabber.shared.Song;
import edu.ycp.cs320.tabber.shared.User;

public interface IDatabase {
	public User login(String username, String password);
	
	public Song findSong(String userName, String songName);
	
	public void createAccount(String Username, String Password, String Email);
	
	public void changeUserInfo(String Username, String Password, String Email);
}
