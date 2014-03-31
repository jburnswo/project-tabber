package edu.ycp.cs320.tabber.server.controllers;

import edu.ycp.cs320.tabber.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.tabber.shared.User;

public class LoginController {
	public User login(String username, String password) {
		return DatabaseProvider.getInstance().login(username, password);
	}
}
