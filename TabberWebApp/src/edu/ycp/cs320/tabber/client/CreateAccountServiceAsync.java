package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.tabber.shared.User;

public interface CreateAccountServiceAsync {

	void createAccount(String Username, String Password, String Email,
			AsyncCallback<User> callback);

}
