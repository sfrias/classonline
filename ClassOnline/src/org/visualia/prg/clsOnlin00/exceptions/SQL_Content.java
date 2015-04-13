package org.visualia.prg.clsOnlin00.exceptions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;//JDBC 4.1 o posterior

public class SQL_Content {

	public SQL_Content() {
		// TODO Auto-generated constructor stub
	}
	public static void viewTable(Connection con) throws SQLException {

	    String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

	    try (Statement stmt = con.createStatement()) {
	        ResultSet rs = stmt.executeQuery(query);

	        while (rs.next()) {
	            String coffeeName = rs.getString("COF_NAME");
	            int supplierID = rs.getInt("SUP_ID");
	            float price = rs.getFloat("PRICE");
	            int sales = rs.getInt("SALES");
	            int total = rs.getInt("TOTAL");

	            System.out.println(coffeeName + ", " + supplierID + ", " + 
	                               price + ", " + sales + ", " + total);
	        }
	    } catch (SQLException e) {
	        JDBCTutorialUtilities.printSQLException(e);
	    }
	}

}
