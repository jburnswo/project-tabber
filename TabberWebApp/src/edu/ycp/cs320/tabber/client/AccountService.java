package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.tabber.shared.User;

@RemoteServiceRelativePath("account")
public interface AccountService extends RemoteService {
	public void changeUserInfo(String Username, String Password, String Email);
}
