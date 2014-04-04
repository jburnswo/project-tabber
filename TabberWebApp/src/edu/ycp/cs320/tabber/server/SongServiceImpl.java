package edu.ycp.cs320.tabber.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.tabber.client.SongService;
import edu.ycp.cs320.tabber.server.controllers.FindSong;
import edu.ycp.cs320.tabber.shared.Song;

public class SongServiceImpl extends RemoteServiceServlet implements SongService {

	@Override
	public Song findSong(String userName, String songName) {
		FindSong controller = new FindSong();
		
		System.out.printf("Server: findSong called, userName=%s, songName=%s\n", userName, songName);
		
		Song result = controller.findSong(userName, songName);
		
		if (result == null) {
			System.out.println("Could not find song?");
		}
		
		return result;
	}

}
