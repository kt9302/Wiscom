package models;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class Top3Model {

	private ArrayList<DataTable> dataTables = new ArrayList<DataTable>();
	public ArrayList<String> dataStringList = new ArrayList<String>();
	public ArrayList<String> categoryStringList = new ArrayList<String>();
	public String[] dataStrings;
	
	@SuppressWarnings("deprecation")
	public Top3Model() {
    	String strLine = "";
    	
    	// Load top 3 aspects of categories.
    	// File format: Arcade & Action\tAttractiveness (60%)    Stability (18%) Cost (11%)
    	String pathName = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "top3" + File.separatorChar + "top3.txt";
    	BufferedReader brTop3 = null;
		try {
			brTop3 = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathName))));
		} catch (FileNotFoundException e1) {
			System.out.println("Top3 file not found.");
			e1.printStackTrace();
		}
    	
    	try {
    		String dataString = "";
			while ((strLine = brTop3.readLine()) != null)   {
				String[] dataPoint = strLine.split("\t");
				categoryStringList.add(dataPoint[0]);
				dataPoint = dataPoint[1].split("\\s+");
				int sum = 100;
				DataTable dataTable = new DataTable();
		    	ArrayList<ColumnDescription> cols = new ArrayList<ColumnDescription>();
		        cols.add(new ColumnDescription("complaint", ValueType.TEXT, "Complaint"));
		        cols.add(new ColumnDescription("weight", ValueType.NUMBER, "Weight"));
		        dataTable.addColumns(cols);
		        int percentage = Integer.parseInt(dataPoint[1].split("%")[0].substring(1));
				dataTable.addRowFromValues(dataPoint[0], percentage, true);
				sum -= percentage;
		        percentage = Integer.parseInt(dataPoint[3].split("%")[0].substring(1));
				dataTable.addRowFromValues(dataPoint[2], percentage, true);
				sum -= percentage;
		        percentage = Integer.parseInt(dataPoint[5].split("%")[0].substring(1));
				dataTable.addRowFromValues(dataPoint[4], percentage, true);
				sum -= percentage;
				dataTable.addRowFromValues("Other", sum, true);
				dataString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(dataTable, true, true).toString();
				dataTables.add(dataTable);
				dataStringList.add(dataString);
			}
			brTop3.close();
		} catch (IOException e) {
			System.out.println("Error reading appname file.");
			e.printStackTrace();
		} catch (TypeMismatchException e) {
			System.out.println("Table entry type mismatch.");
			e.printStackTrace();
		}        
    	
    	dataStrings = dataStringList.toArray(new String[dataStringList.size()]);
    }
}
