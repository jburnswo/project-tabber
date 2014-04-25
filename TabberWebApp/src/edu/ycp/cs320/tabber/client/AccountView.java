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

public class AccountView extends Composite implements ISubscriber{
	public AccountView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		InlineLabel UserNameLabel = new InlineLabel("Username:");
		panel.add(UserNameLabel);
		panel.setWidgetLeftWidth(UserNameLabel, 11.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(UserNameLabel, 22.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel PassWordLabel = new InlineLabel("Password:");
		panel.add(PassWordLabel);
		panel.setWidgetLeftWidth(PassWordLabel, 11.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(PassWordLabel, 46.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel EmailLabel = new InlineLabel("Email:");
		panel.add(EmailLabel);
		panel.setWidgetLeftWidth(EmailLabel, 11.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(EmailLabel, 70.0, Unit.PX, 18.0, Unit.PX);
		
		TextBox ChangePassWordTextBox = new TextBox();
		panel.add(ChangePassWordTextBox);
		panel.setWidgetLeftWidth(ChangePassWordTextBox, 11.0, Unit.PX, 173.0, Unit.PX);
		panel.setWidgetTopHeight(ChangePassWordTextBox, 129.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox ChnageEmailTextBox = new TextBox();
		panel.add(ChnageEmailTextBox);
		panel.setWidgetLeftWidth(ChnageEmailTextBox, 11.0, Unit.PX, 173.0, Unit.PX);
		panel.setWidgetTopHeight(ChnageEmailTextBox, 169.0, Unit.PX, 34.0, Unit.PX);
		
		Button ChangePassWordButton = new Button("New button");
		ChangePassWordButton.setText("Change Password\r\n");
		panel.add(ChangePassWordButton);
		panel.setWidgetLeftWidth(ChangePassWordButton, 190.0, Unit.PX, 127.0, Unit.PX);
		panel.setWidgetTopHeight(ChangePassWordButton, 129.0, Unit.PX, 30.0, Unit.PX);
		
		Button ChangeEmailButton = new Button("New button");
		ChangeEmailButton.setText("Change Email");
		panel.add(ChangeEmailButton);
		panel.setWidgetLeftWidth(ChangeEmailButton, 190.0, Unit.PX, 127.0, Unit.PX);
		panel.setWidgetTopHeight(ChangeEmailButton, 169.0, Unit.PX, 30.0, Unit.PX);
		
		Button BackButton = new Button("Back");
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
