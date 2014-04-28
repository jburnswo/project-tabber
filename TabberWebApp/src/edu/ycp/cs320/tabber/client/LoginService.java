package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.tabber.shared.User;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService{
	public void userLogIn(String Username);
}
