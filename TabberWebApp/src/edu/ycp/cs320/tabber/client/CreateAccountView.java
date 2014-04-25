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

public class CreateAccountView extends Composite implements ISubscriber{
	public CreateAccountView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		TextBox UserNameTextBox = new TextBox();
		panel.add(UserNameTextBox);
		panel.setWidgetLeftWidth(UserNameTextBox, 101.0, Unit.PX, 173.0, Unit.PX);
		panel.setWidgetTopHeight(UserNameTextBox, 38.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox PassWordTextBox = new TextBox();
		panel.add(PassWordTextBox);
		panel.setWidgetLeftWidth(PassWordTextBox, 101.0, Unit.PX, 173.0, Unit.PX);
		panel.setWidgetTopHeight(PassWordTextBox, 78.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox EmailTextBox = new TextBox();
		panel.add(EmailTextBox);
		panel.setWidgetLeftWidth(EmailTextBox, 101.0, Unit.PX, 173.0, Unit.PX);
		panel.setWidgetTopHeight(EmailTextBox, 118.0, Unit.PX, 34.0, Unit.PX);
		
		InlineLabel UserNameLabel = new InlineLabel("Username:");
		panel.add(UserNameLabel);
		panel.setWidgetLeftWidth(UserNameLabel, 5.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(UserNameLabel, 38.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel PassWordLabel = new InlineLabel("Password:");
		panel.add(PassWordLabel);
		panel.setWidgetLeftWidth(PassWordLabel, 5.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(PassWordLabel, 78.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel EmailLabel = new InlineLabel("Email:");
		panel.add(EmailLabel);
		panel.setWidgetLeftWidth(EmailLabel, 5.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(EmailLabel, 118.0, Unit.PX, 18.0, Unit.PX);
		
		Button CreateButton = new Button("New button");
		CreateButton.setText("Create");
		panel.add(CreateButton);
		panel.setWidgetLeftWidth(CreateButton, 101.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(CreateButton, 171.0, Unit.PX, 30.0, Unit.PX);
		
		CreateButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new MainView());
			}
		});
		
		Button BackButton = new Button("New button");
		BackButton.setText("Back");
		panel.add(BackButton);
		panel.setWidgetLeftWidth(BackButton, 369.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(BackButton, 270.0, Unit.PX, 30.0, Unit.PX);
		
		BackButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new MainView());
			}
		});
	}
	
	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
	}
}
