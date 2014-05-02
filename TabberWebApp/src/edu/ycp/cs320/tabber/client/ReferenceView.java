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
import com.google.gwt.user.client.ui.Button;

public class ReferenceView extends Composite implements ISubscriber  {
	public ReferenceView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		InlineLabel ReferenceGuideLabel = new InlineLabel("Reference Guide");
		panel.add(ReferenceGuideLabel);
		panel.setWidgetLeftWidth(ReferenceGuideLabel, 159.0, Unit.PX, 111.0, Unit.PX);
		panel.setWidgetTopHeight(ReferenceGuideLabel, 0.0, Unit.PX, 18.0, Unit.PX);
		
		Button CircleOfFifthsButton = new Button("New button");
		CircleOfFifthsButton.setText("Circle of Fifths");
		panel.add(CircleOfFifthsButton);
		panel.setWidgetLeftWidth(CircleOfFifthsButton, 10.0, Unit.PX, 101.0, Unit.PX);
		panel.setWidgetTopHeight(CircleOfFifthsButton, 112.0, Unit.PX, 30.0, Unit.PX);
		
		CircleOfFifthsButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button ChordsButton = new Button("New button");
		ChordsButton.setText("Chords");
		panel.add(ChordsButton);
		panel.setWidgetLeftWidth(ChordsButton, 126.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(ChordsButton, 112.0, Unit.PX, 30.0, Unit.PX);
		
		ChordsButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new ChordView());
			}
		});
		
		Button KeysButton = new Button("New button");
		KeysButton.setText("Keys");
		panel.add(KeysButton);
		panel.setWidgetLeftWidth(KeysButton, 224.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(KeysButton, 112.0, Unit.PX, 30.0, Unit.PX);
		
		KeysButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button NeckLayoutButton = new Button("New button");
		NeckLayoutButton.setText("Neck Layout");
		panel.add(NeckLayoutButton);
		panel.setWidgetLeftWidth(NeckLayoutButton, 324.0, Unit.PX, 101.0, Unit.PX);
		panel.setWidgetTopHeight(NeckLayoutButton, 112.0, Unit.PX, 30.0, Unit.PX);
		
		NeckLayoutButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
	}
	
	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
	}
}
