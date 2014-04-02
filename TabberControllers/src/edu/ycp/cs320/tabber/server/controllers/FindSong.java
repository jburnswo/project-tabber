package edu.ycp.cs320.tabber.server.controllers;

import edu.ycp.cs320.tabber.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.tabber.shared.Song;

public class FindSong {

	public Song findSong(String userName, String songName) {
		return DatabaseProvider.getInstance().findSong(userName, songName);
	}
	
}
