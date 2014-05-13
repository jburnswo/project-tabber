package edu.ycp.cs320.tabber.server.controllers;

import edu.ycp.cs320.tabber.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.tabber.shared.User;

public class ChangeAccountController {
	public void changeUserInfo(String Username, String Password, String Email){
		DatabaseProvider.getInstance().changeUserInfo(Username,Password,Email);
	}
}
