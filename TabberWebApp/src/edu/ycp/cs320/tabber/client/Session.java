package edu.ycp.cs320.tabber.client;

import edu.ycp.cs320.tabber.shared.User;

public class Session {
	private static Session theInstance = new Session();
	
	public static Session getInstance() {
		return theInstance;
	}
	
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
}
