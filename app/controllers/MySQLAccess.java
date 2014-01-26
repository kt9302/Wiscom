
package controllers;

import java.io.File;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.math.BigInteger;

import au.com.bytecode.opencsv.CSVWriter;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MySQLAccess {
	private Connection connect=null;
	private Statement statement=null;
	private PreparedStatement preparedStatement=null;
	private ResultSet resultSet=null;
	private int id;
	private int lower;
	private int upper;
	public MySQLAccess(int id, int lb,int ub){
			this.id=id;
			lower=lb;
			upper=ub;
	}
	
	
	public void readDataBase() throws Exception {
		try {
			//This loads the MySql driver. EveryDB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			//Setup connection with the DB.
			connect=(Connection) DriverManager.getConnection("jdbc:mysql://patmos.banatao.berkeley.edu:3308/newgoogleplaydataset?"+"user=tiankang&password=ktRUGS2013");
			//Statement allows to issue SQL queries to the DB.
			statement=connect.createStatement();
			ResultSet r1=statement.executeQuery("select min(creationtime) from appcomment where appid="+id);
			r1.first();
			BigInteger offset=new BigInteger(r1.getString("min(creationtime)"));
			System.out.println(offset.toString());
			BigInteger	lowertime=offset.add(BigInteger.valueOf(lower).multiply(BigInteger.valueOf(24*3600*1000)));
			
			BigInteger	uppertime=offset.add(BigInteger.valueOf(upper).multiply(BigInteger.valueOf(24*3600*1000)));
			
			//ResultSet gets the result of sql query
			System.out.println(lowertime.toString());
			System.out.println(uppertime.toString());
			resultSet=statement.executeQuery("select * from newgoogleplaydataset.appcomment where appid="+id+" and creationtime>"+lowertime.toString()+" and creationtime<"+uppertime.toString());
			writeResultSet(resultSet);
			
			
			
			
		      
		   
		      
		} catch (Exception e){
			throw e;
		} finally {
			close();
		}
		
		
	}
	
	
	private void writeResultSet(ResultSet resultSet) throws SQLException{
		int i=1;
		 CSVWriter writer;
		try {
			writer = new CSVWriter(new FileWriter(new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda"+File.separatorChar+"comment.csv"));
			ArrayList<String[]> database = new ArrayList<String[]>();
			while (resultSet.next()){
				String comment=resultSet.getString("commenttext");
				database.add(new String[] {""+i,comment});
			    i++;
			}
			writer.writeAll(database); 
		    writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
		
	}
	private void close(){
		try {
		      if (resultSet != null) {
		        resultSet.close();
		      }

		      if (statement != null) {
		        statement.close();
		      }

		      if (connect != null) {
		        connect.close();
		      }
		    } catch (Exception e) {

		    }
	}
	
}