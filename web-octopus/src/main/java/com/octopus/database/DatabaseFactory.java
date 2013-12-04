package com.octopus.database;

public class DatabaseFactory {

	public IDbConnector getServiceDataBase(String table) {
		int t = 0;
		if ("social".equals(table)) {
			t = 0;
		} else if ("stock".equals(table)) {
			t = 1;
		}
		return new ArrayDbConnector(t);
	}

}
