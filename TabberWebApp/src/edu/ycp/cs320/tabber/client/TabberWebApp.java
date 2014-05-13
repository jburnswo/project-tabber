package edu.ycp.cs320.tabber.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;

import edu.ycp.cs320.tabber.shared.Song;

import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.InlineLabel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TabberWebApp implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		RootLayoutPanel rootLayoutPanel_1 = RootLayoutPanel.get();
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		final SongView view = new SongView();
		rootLayoutPanel.add(view);
		rootLayoutPanel.setWidgetLeftWidth(view, 10.0, Unit.PX, 430.0, Unit.PX);
		RootLayoutPanel rootLayoutPanel_2 = RootLayoutPanel.get();
		rootLayoutPanel_2.setWidgetLeftRight(view, 10.0, Unit.PX, 10.0, Unit.PX);
		
		
		// For now, just load an initial song and display it
		/*
		RPC.songService.findSong("username", "Twinkle Twinkle Little Star" , new AsyncCallback<Song>() {
			
			@Override
			public void onSuccess(Song result) {
				// Display the song in the view
				view.setModel(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Util.alertWidget("Error", "Could not load song: " + caught.getMessage()).center();
			}
		});
		*/
	}
}
