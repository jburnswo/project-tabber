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

public class MainView extends Composite implements ISubscriber {
	public MainView(){
		LayoutPanel panel = new LayoutPanel();
		initWidget(panel);
		
		Button btnTab = new Button("TAB");
		panel.add(btnTab);
		panel.setWidgetLeftWidth(btnTab, 182.0, Unit.PX, 81.0, Unit.PX);
		panel.setWidgetTopHeight(btnTab, 171.0, Unit.PX, 30.0, Unit.PX);
		
		Button btnReferenceGuide = new Button("Reference Guide");
		panel.add(btnReferenceGuide);
		panel.setWidgetLeftWidth(btnReferenceGuide, 156.0, Unit.PX, 135.0, Unit.PX);
		panel.setWidgetTopHeight(btnReferenceGuide, 207.0, Unit.PX, 30.0, Unit.PX);
		
		Button btnLogin = new Button("Login");
		panel.add(btnLogin);
		panel.setWidgetLeftWidth(btnLogin, 394.0, Unit.PX, 56.0, Unit.PX);
		panel.setWidgetTopHeight(btnLogin, 0.0, Unit.PX, 30.0, Unit.PX);
		
		btnLogin.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				TabberWebApp.setView(new LoginView());
			}
		});
		
		Button btnCreateAccount = new Button("Create Account");
		panel.add(btnCreateAccount);
		panel.setWidgetLeftWidth(btnCreateAccount, 331.0, Unit.PX, 119.0, Unit.PX);
		panel.setWidgetTopHeight(btnCreateAccount, 36.0, Unit.PX, 30.0, Unit.PX);
		
	}
	
	@Override
	public void eventOccurred(Object key, IPublisher publisher, Object hint) {
	}
}
