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
import edu.ycp.cs320.tabber.shared.User;

import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class LoginView extends Composite implements ISubscriber {

	public LoginView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		final TextBox UserNameTextBox = new TextBox();
		panel.add(UserNameTextBox);
		panel.setWidgetLeftWidth(UserNameTextBox, 110.0, Unit.PX, 136.0, Unit.PX);
		panel.setWidgetTopHeight(UserNameTextBox, 54.0, Unit.PX, 28.0, Unit.PX);
		
		final TextBox PassWordTextBox = new TextBox();
		panel.add(PassWordTextBox);
		panel.setWidgetLeftWidth(PassWordTextBox, 110.0, Unit.PX, 136.0, Unit.PX);
		panel.setWidgetTopHeight(PassWordTextBox, 88.0, Unit.PX, 28.0, Unit.PX);
		
		Button LoginButton = new Button("Login");
		panel.add(LoginButton);
		panel.setWidgetLeftWidth(LoginButton, 137.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(LoginButton, 122.0, Unit.PX, 30.0, Unit.PX);
		
		LoginButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String Username=UserNameTextBox.getText();
		    	String Password=PassWordTextBox.getText();
		    	RPC.loginService.login(Username, Password , new AsyncCallback<User>() {
					
					@Override
					public void onSuccess(User result) {
						// User is logged in
						result.login();
						
						// Store the User object in the Session
						Session.getInstance().setUser(result);
					}
					
					@Override
					public void onFailure(Throwable caught) {
						Util.alertWidget("Error", "Could not login: " + caught.getMessage()).center();
					}
				});
			}
		});
		
		InlineLabel UserNameLabel = new InlineLabel("Username:");
		panel.add(UserNameLabel);
		panel.setWidgetLeftWidth(UserNameLabel, 14.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(UserNameLabel, 54.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel PassWordLabel = new InlineLabel("Password:");
		panel.add(PassWordLabel);
		panel.setWidgetLeftWidth(PassWordLabel, 14.0, Unit.PX, 90.0, Unit.PX);
		panel.setWidgetTopHeight(PassWordLabel, 88.0, Unit.PX, 18.0, Unit.PX);
		
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
