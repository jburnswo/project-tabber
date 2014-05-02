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

public class ChordView extends Composite implements ISubscriber  {
	public ChordView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		InlineLabel ChordsLabel = new InlineLabel("CHORDS");
		panel.add(ChordsLabel);
		panel.setWidgetLeftWidth(ChordsLabel, 188.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(ChordsLabel, 0.0, Unit.PX, 18.0, Unit.PX);
		
		Button AChordButton = new Button("New button");
		AChordButton.setText("A");
		panel.add(AChordButton);
		panel.setWidgetLeftWidth(AChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(AChordButton, 23.0, Unit.PX, 30.0, Unit.PX);
		
		AChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button BChordButton = new Button("New button");
		BChordButton.setText("B");
		panel.add(BChordButton);
		panel.setWidgetLeftWidth(BChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(BChordButton, 59.0, Unit.PX, 30.0, Unit.PX);
		
		BChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button CChordButton = new Button("New button");
		CChordButton.setText("C");
		panel.add(CChordButton);
		panel.setWidgetLeftWidth(CChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(CChordButton, 95.0, Unit.PX, 30.0, Unit.PX);
		
		CChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button DChordButton = new Button("New button");
		DChordButton.setText("D");
		panel.add(DChordButton);
		panel.setWidgetLeftWidth(DChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(DChordButton, 131.0, Unit.PX, 30.0, Unit.PX);
		
		DChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button EChordButton = new Button("New button");
		EChordButton.setText("E");
		panel.add(EChordButton);
		panel.setWidgetLeftWidth(EChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(EChordButton, 167.0, Unit.PX, 30.0, Unit.PX);
		
		EChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button FChordButton = new Button("New button");
		FChordButton.setText("F");
		panel.add(FChordButton);
		panel.setWidgetLeftWidth(FChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(FChordButton, 203.0, Unit.PX, 30.0, Unit.PX);
		
		FChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button GChordButton = new Button("New button");
		GChordButton.setText("G");
		panel.add(GChordButton);
		panel.setWidgetLeftWidth(GChordButton, 106.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(GChordButton, 239.0, Unit.PX, 30.0, Unit.PX);
		
		GChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button AsChordButton = new Button("New button");
		AsChordButton.setText("A#");
		panel.add(AsChordButton);
		panel.setWidgetLeftWidth(AsChordButton, 248.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(AsChordButton, 42.0, Unit.PX, 30.0, Unit.PX);
		
		AsChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button CsChordButton = new Button("New button");
		CsChordButton.setText("C#");
		panel.add(CsChordButton);
		panel.setWidgetLeftWidth(CsChordButton, 248.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(CsChordButton, 108.0, Unit.PX, 30.0, Unit.PX);
		
		CsChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button DsChordButton = new Button("New button");
		DsChordButton.setText("D#");
		panel.add(DsChordButton);
		panel.setWidgetLeftWidth(DsChordButton, 248.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(DsChordButton, 144.0, Unit.PX, 30.0, Unit.PX);
		
		DsChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button FsChordButton = new Button("New button");
		FsChordButton.setText("F#");
		panel.add(FsChordButton);
		panel.setWidgetLeftWidth(FsChordButton, 248.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(FsChordButton, 221.0, Unit.PX, 30.0, Unit.PX);
		
		FsChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
		Button GsChordButton = new Button("New button");
		GsChordButton.setText("G#");
		panel.add(GsChordButton);
		panel.setWidgetLeftWidth(GsChordButton, 248.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(GsChordButton, 257.0, Unit.PX, 30.0, Unit.PX);
		
		GsChordButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new SongView());
			}
		});
		
	}
	
	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
	}
}
