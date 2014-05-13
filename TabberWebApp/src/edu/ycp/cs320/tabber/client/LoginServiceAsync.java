package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.tabber.shared.User;

public interface LoginServiceAsync {

	void login(String username, String password, AsyncCallback<User> callback);

}
