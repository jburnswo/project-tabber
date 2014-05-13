package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;

import edu.ycp.cs320.tabber.shared.IPublisher;
import edu.ycp.cs320.tabber.shared.ISubscriber;
import edu.ycp.cs320.tabber.shared.Song;

import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class SongView extends Composite implements ISubscriber {
	private Song model;
	private InlineLabel songNameDisplayLabel;
	
	public SongView() {
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		InlineLabel songNameLabel = new InlineLabel("Song name:");
		panel.add(songNameLabel);
		panel.setWidgetLeftWidth(songNameLabel, 0.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(songNameLabel, 55.0, Unit.PX, 18.0, Unit.PX);
		
		songNameDisplayLabel = new InlineLabel("");
		panel.add(songNameDisplayLabel);
		panel.setWidgetLeftWidth(songNameDisplayLabel, 109.0, Unit.PX, 311.0, Unit.PX);
		panel.setWidgetTopHeight(songNameDisplayLabel, 55.0, Unit.PX, 18.0, Unit.PX);
		
		final TextBox searchBox = new TextBox();
		panel.add(searchBox);
		panel.setWidgetLeftWidth(searchBox, 96.0, Unit.PX, 173.0, Unit.PX);
		panel.setWidgetTopHeight(searchBox, 0.0, Unit.PX, 34.0, Unit.PX);
		
		InlineLabel searchBoxLabel = new InlineLabel("Search Song:");
		panel.add(searchBoxLabel);
		panel.setWidgetLeftWidth(searchBoxLabel, 0.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(searchBoxLabel, 0.0, Unit.PX, 18.0, Unit.PX);
		
		Button searchButton = new Button("Search");
		searchButton.setText("Search");
		panel.add(searchButton);
		panel.setWidgetLeftWidth(searchButton, 275.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(searchButton, 4.0, Unit.PX, 30.0, Unit.PX);
		
		Button BackButton = new Button("Back");
		panel.add(BackButton);
		panel.setWidgetLeftWidth(BackButton, 369.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(BackButton, 0.0, Unit.PX, 30.0, Unit.PX);
		
		BackButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new MainView());
			}
		});
		
		searchButton.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	String songName=searchBox.getText();
		    	RPC.songService.findSong("username", songName , new AsyncCallback<Song>() {
					
					@Override
					public void onSuccess(Song result) {
						// Display the song in the view
						setModel(result);
					}
					
					@Override
					public void onFailure(Throwable caught) {
						Util.alertWidget("Error", "Could not load song: " + caught.getMessage()).center();
					}
				});
		    }
		});
		
//		searchBox.addKeyPressHandler(new KeyPressHandler() {
//
//		      public void onKeyPress(KeyPressEvent event) {
//		        if (!Character.isDigit(event.getCharCode())) {
//		          ((TextBox) event.getSource()).cancelKey();
//		        }
//		      }
//		    });
//		
//		
	}
	
	public void setModel(Song model) {
		this.model = model;
		display();
	}
	
	// Display the information in the model object
	private void display() {
		songNameDisplayLabel.setText(model.getName());
	}

	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
	}
}
