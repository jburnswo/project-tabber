package edu.ycp.cs320.tabber.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.tabber.shared.User;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	
	public FakeDatabase() {
		userList = new ArrayList<User>();
		// TODO: add some test User objects
	}
	
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
