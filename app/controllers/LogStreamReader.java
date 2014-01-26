
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

import au.com.bytecode.opencsv.CSVWriter;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LogStreamReader implements Runnable {
    
    private BufferedReader reader;
    public String filename="default";
    private String toreturn="1";
    public LogStreamReader(InputStream is) {
        this.reader = new BufferedReader(new InputStreamReader(is));
        
    }
    
    public void run() {
        try {
        	
            reader.close();
            
        	BufferedReader brName = null;
    		try {
    			brName = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(new File(".").getAbsolutePath()
                                                                                                          + File.separatorChar + "data" + File.separatorChar + "lda"+ File.separatorChar+"general_dist"+File.separatorChar+"description.txt"))));
    			String ln=brName.readLine();
    			toreturn=ln;
    			brName.close();
    		} catch (FileNotFoundException e1) {
    			System.out.println("Appname file not found.");
    			e1.printStackTrace();
    		}
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getToreturn(){
    	return toreturn;
    }
}