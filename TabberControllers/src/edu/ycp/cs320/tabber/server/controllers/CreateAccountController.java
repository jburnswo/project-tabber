package edu.ycp.cs320.tabber.server.controllers;

import edu.ycp.cs320.tabber.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.tabber.shared.User;

public class CreateAccountController {
	public void createAccount(String Username, String Password, String Email){
		DatabaseProvider.getInstance().createAccount(Username,Password,Email);
	}
}
