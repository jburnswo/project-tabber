package edu.ycp.cs320.tabber.server.model.persist;

import edu.ycp.cs320.tabber.shared.User;

public interface IDatabase {
	public User login(String username, String password);
}
