package edu.ycp.cs320.tabber.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;

import edu.ycp.cs320.tabber.shared.Song;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TabberWebApp implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final SongView view = new SongView();
		
		RootLayoutPanel.get().add(view);
		RootLayoutPanel.get().setWidgetLeftRight(view, 10.0, Unit.PX, 10.0, Unit.PX);
		RootLayoutPanel.get().setWidgetTopBottom(view, 10.0, Unit.PX, 10.0, Unit.PX);
		
		// For now, just load an initial song and display it
		RPC.songService.findSong("username", "Twinkle Twinkle Little Star", new AsyncCallback<Song>() {
			
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
	}
}
