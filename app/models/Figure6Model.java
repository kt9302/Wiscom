package models;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.TableRow;
import com.google.visualization.datasource.datatable.value.ValueType;

import controllers.Figure6;
import controllers.Search;

public class Figure6Model {

	private DataTable data = new DataTable(), pieChartData = new DataTable();
	public String dataString = "", pieString = "";
	public String appName = "";
    public String appid;
	public final static String[] categories = {"Attractiveness", "Stability", "Accuracy", "Compatibility",
		"Connectivity", "Cost", "Telephony", "Picture", "Media", "Spam"};
	
//	/**
//	 * Google chart Json object definition: https://developers.google.com/chart/interactive/docs/reference#dataparam
//	 * @param appName
//	 * @throws IOException
//	 */
//    @SuppressWarnings("deprecation")
//	public Figure6Model(String appName) throws IOException {
//    	int counter = 1, interval = 1;
//    	String strLine = "";
//    	
//    	// Load window data for pie charts.
//    	String pathSpikes = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "figure6" + File.separatorChar + appName + "_windows.csv";
//    	BufferedReader brSpikes  = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathSpikes))));
//        // The main categories of the app.
//    	ArrayList<String> categories = new ArrayList<String>();
//    	// The category weights.
//    	List<Double> categoryWeights = new ArrayList<Double>();
//    	// The start and end points of windows.
//    	ArrayList<Integer> windowIndex = new ArrayList<Integer>();
//        
//        windowIndex.add(1);
//        if ((strLine = brSpikes.readLine()) != null)   {
//        	Collections.addAll(categories, (strLine.split(",")));
//        	// Remove "start" and "end" in the first line.
//        	categories.remove(0);
//        	categories.remove(0);
//        }
//    	while ((strLine = brSpikes.readLine()) != null)   {
//    		String[] windowPoint = strLine.split(",");
//    		windowIndex.add(Integer.parseInt(windowPoint[1]));
//    		for (int i = 2; i < windowPoint.length; i++) {
//    			categoryWeights.add(Double.parseDouble(windowPoint[i]));
//    		}
//    	}
//    	brSpikes.close();
//    	// Create pie chart datatable.
//        ArrayList<ColumnDescription> pieChartCols = new ArrayList<ColumnDescription>();
//    	pieChartCols.add(new ColumnDescription("category", ValueType.TEXT, "Category"));
//    	int numWindows = windowIndex.size()-1;
//    	for (int i = 0; i < numWindows; i++) {
//    		pieChartCols.add(new ColumnDescription("weight"+i, ValueType.NUMBER, "Weight"));
//    	}
//    	pieChartData.addColumns(pieChartCols);
//    	for (int i = 0; i < categories.size(); i++) {
//    		TableRow tableRow = new TableRow();
//    		tableRow.addCell(categories.get(i));
//    		try {
//    			for (int j = 0; j < numWindows; j++) {
//    				tableRow.addCell(categoryWeights.get(j*numWindows+i));
//    			}
//				pieChartData.addRow(tableRow);
//			} catch (NumberFormatException e) {
//                System.out.println("Invalid number format!");
//			} catch (TypeMismatchException e) {
//                System.out.println("Invalid type!");
//                e.printStackTrace();
//			}
//    	}
//    	
//    	// Load time series data.
//    	String pathTimeSeries = new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "figure6" + File.separatorChar + appName + "_time_series.csv";
//    	BufferedReader br  = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(pathTimeSeries))));
//
//    	// Create time series datatable.
//        ArrayList<ColumnDescription> cols = new ArrayList<ColumnDescription>();
//        cols.add(new ColumnDescription("index", ValueType.NUMBER, "Index"));
//        cols.add(new ColumnDescription("positive", ValueType.NUMBER, "Positive"));
//        cols.add(new ColumnDescription("negative", ValueType.NUMBER, "Negative"));
//        cols.add(new ColumnDescription("interval", ValueType.NUMBER, "Interval"));
//        cols.add(new ColumnDescription("intervalStart", ValueType.NUMBER, "IntervalStart"));
//        cols.add(new ColumnDescription("intervalEnd", ValueType.NUMBER, "IntervalEnd"));
//        data.addColumns(cols);
//        
//    	while ((strLine = br.readLine()) != null)   {
//    		if (windowIndex.get(interval) < counter) {
//    			interval++;
//    		}
//    		String[] dataPoint = strLine.split(",");
//            try {
//            	data.addRowFromValues(counter++, Integer.parseInt(dataPoint[0]), Integer.parseInt(dataPoint[1]), interval, windowIndex.get(interval-1)-1, windowIndex.get(interval)-1, true);
//            } catch (TypeMismatchException e) {
//                System.out.println("Invalid type!");
//            }
//    	}
//    	br.close();
//    	
//    	
////    	dataString = new Gson().toJson(data);
//    	dataString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(data, true, true).toString();
//    	pieString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(pieChartData, true, true).toString();
//    }

	public Figure6Model(int id) throws IOException {
		this(id, Search.searchModel.getAppName(id));
	}
    
	public Figure6Model(String appName) throws IOException {
		this(Search.searchModel.getAppId(appName), appName);
	}
	
	@SuppressWarnings("deprecation")
	public Figure6Model(int id, String appName) throws IOException {
		this.appName = appName;
		int counter = 1;
        this.appid=Integer.toString(id);
    	String strLine = "";
    	
    	if (id <= 0) {
    		dataString = "Sorry, App: " + appName + " is not found in the database.";
    		
    	}
    	
    	// Retrieve topic distribution from AppModel.
    	if (Figure6.appModel.hasDistribution(id)) {
    		Double[] distribution = Figure6.appModel.getDistribution(id);
	        
	    	// Create pie chart datatable.
	        ArrayList<ColumnDescription> pieChartCols = new ArrayList<ColumnDescription>();
	    	pieChartCols.add(new ColumnDescription("category", ValueType.TEXT, "Category"));
	    	pieChartCols.add(new ColumnDescription("weight", ValueType.NUMBER, "Weight"));
	    	pieChartData.addColumns(pieChartCols);
	    	for (int i = 0; i < categories.length; i++) {
	    		TableRow tableRow = new TableRow();
	    		tableRow.addCell(categories[i]);
	    		try {
	    			tableRow.addCell(distribution[i]);
					pieChartData.addRow(tableRow);
				} catch (NumberFormatException e) {
	                System.out.println("Invalid number format!");
				} catch (TypeMismatchException e) {
	                System.out.println("Invalid type!");
	                e.printStackTrace();
				}
	    	}
	    	pieString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(pieChartData, true, true).toString();
    	}
    	
    	// The zip file contains time series for all apps.
    	ZipFile zf = new ZipFile(new File(new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "time-series.zip"));

    	System.out.println("time-series/"+String.valueOf(id));
    	// Load time series data.
    	ZipEntry entry = zf.getEntry("time-series/"+String.valueOf(id));
    	// If the time series does not exist for this app, end method.
    	if (entry == null) {
            if (!dataString.equals("Sorry, App: " + appName + " is not found in the database.")){
                dataString = "Error: Time series for app: " + appName + " does not exist in the database.";}
    		return;
    	}
    	BufferedReader br  = new BufferedReader(new InputStreamReader(new DataInputStream(zf.getInputStream(zf.getEntry("time-series/"+String.valueOf(id))))));

    	// Create time series datatable.
        ArrayList<ColumnDescription> cols = new ArrayList<ColumnDescription>();
        cols.add(new ColumnDescription("index", ValueType.NUMBER, "Index"));
        cols.add(new ColumnDescription("positive", ValueType.NUMBER, "Positive"));
        cols.add(new ColumnDescription("negative", ValueType.NUMBER, "Negative"));
        cols.add(new ColumnDescription("interval", ValueType.NUMBER, "Interval"));
        cols.add(new ColumnDescription("intervalStart", ValueType.NUMBER, "IntervalStart"));
        cols.add(new ColumnDescription("intervalEnd", ValueType.NUMBER, "IntervalEnd"));
        data.addColumns(cols);
        
    	while ((strLine = br.readLine()) != null)   {
    		String[] dataPoint = strLine.split(",");
            try {
            	data.addRowFromValues(counter++, Integer.parseInt(dataPoint[0]), Integer.parseInt(dataPoint[1]), -1, -1, -1, true);
            } catch (TypeMismatchException e) {
                System.out.println("Invalid type!");
            }
    	}
    	br.close();
    	dataString = com.google.visualization.datasource.render.JsonRenderer.renderDataTable(data, true, true).toString();
	}
}
