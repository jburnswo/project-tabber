package edu.ycp.cs320.tabber.server;

import edu.ycp.cs320.tabber.client.SongService;
import edu.ycp.cs320.tabber.server.controllers.FindSong;
import edu.ycp.cs320.tabber.shared.Song;

public class SongServiceImpl implements SongService {

	@Override
	public Song findSong(String userName, String songName) {
		FindSong controller = new FindSong();
		
		
		return controller.findSong(userName, songName);
	}

}
