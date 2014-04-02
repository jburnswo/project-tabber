package edu.ycp.cs320.tabber.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.ycp.cs320.tabber.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.tabber.server.model.persist.FakeDatabase;

public class DatabaseInitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// Called when webapp starts
		DatabaseProvider.setInstance(new FakeDatabase()); // TODO: eventually, use real database
		System.out.println("Database is initialized!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// Called when webapp shuts down

	}

}
