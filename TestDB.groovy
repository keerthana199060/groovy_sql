package com.javacodegeeks.example.groovy.util


	import java.sql.*;
	import groovy.sql.Sql
	
	class TestDB {
	   static void main(String[] args) {
		  // Creating a connection to the database
		  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test',
			 'root', 'root', 'com.mysql.jdbc.Driver')
				
		  // Executing the query SELECT VERSION which gets the version of the database
		  // Also using the eachROW method to fetch the result from the database
	   
		  sql.eachRow('SELECT * FROM cats;'){ row ->
			 println row[0] + " ," + row[1] + " ," + row[2] + " ," + row[3]
		  }
			
		  sql.close()
	   }
	}


