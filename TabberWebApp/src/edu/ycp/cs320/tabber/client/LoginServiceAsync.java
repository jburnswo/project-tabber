package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void userLogIn(String Username, AsyncCallback<Void> callback);

}
