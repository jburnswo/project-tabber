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
//		userList.add(jburnswo);
//		userList.add(jsalaza1);
		
		songList = new ArrayList<Song>();
		Song song = new Song();
		Song song2 = new Song();
		Song song3 = new Song();
		Song song4 = new Song();
		Song song5 = new Song();
		Song song6 = new Song();
		Song song7 = new Song();
		Song song8 = new Song();
		Song song9 = new Song();
		Song song10 = new Song();
		Song song11 = new Song();
		Song song12 = new Song();
		// TODO: initialize the Song
		song.setName("Twinkle Twinkle Little Star");
		song2.setName("Lemon Meringue Tie");
		song3.setName("Hats off to the Bull");
		song4.setName("Back in Black");
		song5.setName("Rebel Yell");
		song6.setName("Acid Rain");
		song7.setName("Hail to the King");
		song8.setName("Broken");
		song9.setName("Welcome Home(Sanitarium)");
		song10.setName("Happiness");
		song11.setName("Seven");
		song12.setName("Shepherd of Fire");
		songList.add(song);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		songList.add(song5);
		songList.add(song6);
		songList.add(song7);
		songList.add(song8);
		songList.add(song9);
		songList.add(song10);
		songList.add(song11);
		songList.add(song12);
	}
	
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		for (User user : userList) {
			if (user.getUserName().equals(username)) {
				if(password==user.getPassWord()){
					return user;
				}
			}
		}
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

	@Override
	public void createAccount(String Username, String Password, String Email) {
		// TODO Auto-generated method stub
		
		User newUser = new User();
		newUser.setUserName(Username);
		newUser.setPassWord(Password);
		newUser.setEmail(Email);
		this.userList.add(newUser);
		
	}

	@Override
	public void changeUserInfo(String Username, String Password, String Email) {
		// TODO Auto-generated method stub
		for (User user : userList) {
			if (user.getUserName().equals(Username)) {
				user.setPassWord(Password);
				user.setEmail(Email);
			}
		}
		
	}
}
