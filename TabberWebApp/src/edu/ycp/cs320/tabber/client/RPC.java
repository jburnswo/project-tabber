package edu.ycp.cs320.tabber.client;

import com.google.gwt.core.shared.GWT;

public class RPC {
	public static final SongServiceAsync songService =
			GWT.create(SongService.class);
}
