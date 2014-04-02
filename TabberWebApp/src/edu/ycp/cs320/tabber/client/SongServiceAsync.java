package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.tabber.shared.Song;

public interface SongServiceAsync {

	void findSong(String userName, String songName, AsyncCallback<Song> callback);

}
