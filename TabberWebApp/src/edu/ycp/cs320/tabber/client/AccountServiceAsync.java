package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AccountServiceAsync {

	void changeUserInfo(String Username, String Password, String Email,
			AsyncCallback<Void> callback);

}
