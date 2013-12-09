package models;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AppModel {

	private HashMap<Integer, Double[]> appDistributions = new HashMap<Integer, Double[]>();
	
	public AppModel() {
    	String strLine = "";
    	
    	// Load app names.
    	// File format: 0,0.13487691720465644,0.00932646001892196,0.007216761839151444,0.016331795519051725,0.24233034108953921,0.004900015657865985,
    	// 4.488865814669831E-4,0.16150518409137524,0.40828710825364356,0.014776529744328042
    	String pathName = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda-topic-distributuions.csv";
    	BufferedReader brName = null;
		try {
			brName = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathName))));
		} catch (FileNotFoundException e1) {
			System.out.println("Appname file not found.");
			e1.printStackTrace();
		}
    	
    	try {
			while ((strLine = brName.readLine()) != null)   {
				String[] distributionArray = strLine.split(",");
				Double[] newDistribution = new Double[10];
				for (int i = 1; i <= 10; i++) {
					newDistribution[i-1] = Double.parseDouble(distributionArray[i]);
				}
				appDistributions.put(Integer.parseInt(distributionArray[0]), newDistribution);
			}
		} catch (IOException e) {
			System.out.println("Error reading appname file.");
			e.printStackTrace();
		}
    }
	
	public boolean hasDistribution(int id) {
		return appDistributions.containsKey(id);
	}
	
	public Double[] getDistribution(int id) {
		return appDistributions.get(id);
	}
}
