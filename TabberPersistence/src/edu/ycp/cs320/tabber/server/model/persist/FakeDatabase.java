package edu.ycp.cs320.tabber.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.tabber.shared.Song;
import edu.ycp.cs320.tabber.shared.User;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	private List<Song> songList; // FIXME: for now, just one user's songs
	
	public FakeDatabase() {
		userList = new ArrayList<User>();
		// TODO: add some test User objects
		User jburnswo = new User();
		User jsalaza1 = new User();
		userList.add(jburnswo);
		userList.add(jsalaza1);
		
		songList = new ArrayList<Song>();
		Song song = new Song();
		Song song2 = new Song();
		Song song3 = new Song();
		// TODO: initialize the Song
		song.setName("Twinkle Twinkle Little Star");
		song2.setName("Lemon Meringue Tie");
		song3.setName("Hats off to the Bull");
		songList.add(song);
		songList.add(song2);
		songList.add(song3);
	}
	
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Song findSong(String userName, String songName) {
		for (Song song : songList) {
			if (song.getName().equals(songName)) {
				return song;
			}
		}
		return null;
	}
}
