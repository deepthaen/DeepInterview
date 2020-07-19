package com.sample.single;

public class DbSingleTone {
	
	
	public static DbSingleTone connection = null;
	
	public DbSingleTone() {
		//connecting to DB
		connection = connection;
		/**
		 * if my connection is empty or null
		 * generate new connection
		 */
		getConnection();
	}
	
	public static DbSingleTone getConnection() {
		if(connection == null) {
			connection = new DbSingleTone();
		}
		
		return connection;
	}
	
	
	
	/**
	 * File not found Exception
	 * Array out of bound
	 * Match Expection
	 * 
	 */

}
