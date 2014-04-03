package edu.ycp.cs320.tabber.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;

import edu.ycp.cs320.tabber.shared.IPublisher;
import edu.ycp.cs320.tabber.shared.ISubscriber;
import edu.ycp.cs320.tabber.shared.Song;

public class SongView extends Composite implements ISubscriber {
	private Song model;
	private InlineLabel songNameDisplayLabel;
	
	public SongView() {
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		InlineLabel songNameLabel = new InlineLabel("Song name:");
		panel.add(songNameLabel);
		panel.setWidgetLeftWidth(songNameLabel, 0.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(songNameLabel, 33.0, Unit.PX, 18.0, Unit.PX);
		
		songNameDisplayLabel = new InlineLabel("");
		panel.add(songNameDisplayLabel);
		panel.setWidgetLeftWidth(songNameDisplayLabel, 110.0, Unit.PX, 311.0, Unit.PX);
		panel.setWidgetTopHeight(songNameDisplayLabel, 33.0, Unit.PX, 18.0, Unit.PX);
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
