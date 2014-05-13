package edu.ycp.cs320.tabber.client;

import com.google.gwt.core.shared.GWT;

public class RPC {
	public static final SongServiceAsync songService =
			GWT.create(SongService.class);
	public static final CreateAccountServiceAsync createAccountService =
			GWT.create(CreateAccountService.class);
	public static final AccountServiceAsync accountService =
			GWT.create(AccountService.class);
	public static final LoginServiceAsync loginService =
			GWT.create(LoginService.class);
}
