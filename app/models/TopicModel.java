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

public class TopicModel {

	private ArrayList<DataTable> dataTables = new ArrayList<DataTable>();
	public ArrayList<String> dataStringList = new ArrayList<String>();
	public String[] dataStrings;
	
	@SuppressWarnings("deprecation")
	public TopicModel() {
    	String strLine = "";
    	
    	// Load top words of topics.
    	// File format: Topic 00\t\tWeight
    	//				\tword\tWeight
    	String pathName = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "topic" + File.separatorChar + "lda-topic-topwords.txt";
    	BufferedReader brName = null;
		try {
			brName = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathName))));
		} catch (FileNotFoundException e1) {
			System.out.println("Top word file not found.");
			e1.printStackTrace();
		}
    	
    	try {
    		Double sum = 0.0;
    		DataTable dataTable = null;
    		String dataString = "";
			while ((strLine = brName.readLine()) != null)   {
				String[] dataPoint = strLine.split("\t");
				if (dataPoint.length < 3) {
					continue;
				}
				if (!dataPoint[0].equals("")) {
					if (dataTable != null) {
						dataTable.addRowFromValues("other", sum, true);
						dataString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(dataTable, true, true).toString();
						dataTables.add(dataTable);
						dataStringList.add(dataString);
					}
					sum = Double.parseDouble(dataPoint[2]);
					dataTable = new DataTable();
			    	ArrayList<ColumnDescription> cols = new ArrayList<ColumnDescription>();
			        cols.add(new ColumnDescription("word", ValueType.TEXT, "Word"));
			        cols.add(new ColumnDescription("weight", ValueType.NUMBER, "Weight"));
			        dataTable.addColumns(cols);
				} else {
					dataTable.addRowFromValues(dataPoint[1], Double.parseDouble(dataPoint[2]), true);
					sum -= Double.parseDouble(dataPoint[2]);
				}
			}
			dataTable.addRowFromValues("other", sum, true);
			dataString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(dataTable, true, true).toString();
			dataTables.add(dataTable);
			dataStringList.add(dataString);
			brName.close();
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
