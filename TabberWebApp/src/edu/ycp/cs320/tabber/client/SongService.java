package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.tabber.shared.Song;

@RemoteServiceRelativePath("song")
public interface SongService extends RemoteService {
	public Song findSong(String userName, String songName);
}
