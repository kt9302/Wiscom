package models;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class SearchModel {

	public HashMap<Integer, String> appMap = new HashMap<Integer, String>();
	public ArrayList<String> appNames = new ArrayList<String>();
	
	public SearchModel() {
    	String strLine = "";
    	
    	// Load app names.
    	// File format: 1,Beautiful Widgets
    	String pathName = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "search" + File.separatorChar + "id-appname.csv";
    	BufferedReader brName = null;
		try {
			brName = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathName))));
		} catch (FileNotFoundException e1) {
			System.out.println("Appname file not found.");
			e1.printStackTrace();
		}
    	
    	try {
			while ((strLine = brName.readLine()) != null)   {
				String[] nameArray = strLine.split(",");
				appNames.add(nameArray[0]+":"+nameArray[1]);
				appMap.put(Integer.parseInt(nameArray[0]), nameArray[1]);
			}
		} catch (IOException e) {
			System.out.println("Error reading appname file.");
			e.printStackTrace();
		}
    }
	
	public ArrayList<String> search(String appName) {
		ArrayList<String> result = new ArrayList<String>();
        String searchName= "";
		for (int i=0;i<appName.length();i++)
            if (Character.isLetterOrDigit(appName.charAt(i)) || appName.charAt(i)==' ') searchName+=appName.substring(i,i+1);
        searchName=searchName.toLowerCase();
		for (String s1 : appNames) {
			if (result.size() == 30)
				break;
            
            String s2="";
            
            for (int i=0;i<s1.length();i++){
                if (Character.isLetterOrDigit(s1.charAt(i)) || s1.charAt(i)==' ') s2 +=s1.substring(i,i+1);}
			if ((s1.toLowerCase().indexOf(searchName) > -1)||(s2.toLowerCase().indexOf(searchName) > -1)) {
				result.add(s1);
			}
		}
		
		return result;
	}
	
	public String getAppName(int id) {
		return appMap.get(id);
	}
	
	public int getAppId(String appName) {
		for (int i:appMap.keySet()) {
			if (appMap.get(i).equals(appName)) {
				return i;
			}
		}
		return -1;
	}
}
