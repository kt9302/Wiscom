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

public class LassoModel {
	private DataTable lassoData = new DataTable();
	public String lassoString = "";

	@SuppressWarnings("deprecation")
	public LassoModel() {
		String strLine = "";

		// Load word lasso result.
		// File format: word string, weight, frequency
		String pathName = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lasso" + File.separatorChar + "lasso_1m_result.csv";
		BufferedReader brLasso = null;
		try {
			brLasso = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathName))));
		} catch (FileNotFoundException e1) {
			System.out.println("Lasso file not found.");
			e1.printStackTrace();
		}
		
		// Create time series datatable.
        ArrayList<ColumnDescription> cols = new ArrayList<ColumnDescription>();
        cols.add(new ColumnDescription("word", ValueType.TEXT, "Word"));
        cols.add(new ColumnDescription("weight", ValueType.NUMBER, "Weight"));
        cols.add(new ColumnDescription("frequency", ValueType.NUMBER, "Frequency"));
        lassoData.addColumns(cols);
        
        int counter = 0;
    	try {
			while (((strLine = brLasso.readLine()) != null) && (counter++<1000))   {
				String[] dataPoint = strLine.split(",");
			    try {
			    	lassoData.addRowFromValues(dataPoint[0], Double.parseDouble(dataPoint[1]), Double.parseDouble(dataPoint[2]));
			    } catch (TypeMismatchException e) {
			        System.out.println("Invalid type!");
			    }
			}
	    	brLasso.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	lassoString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(lassoData, true, true).toString();
	}
}
