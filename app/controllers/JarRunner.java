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




public class JarRunner {
	private int id;
	private int lower;
	private int upper;
	
	public JarRunner(int id,int lower, int upper){
		this.id=id;
		this.lower=lower;
		this.upper=upper;
	}
	public String[] run(){
		MySQLAccess my=new MySQLAccess(id, lower,upper);
		try{
			my.readDataBase();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		ProcessBuilder pb = new ProcessBuilder("java", "-jar", "tmt-0.4.0.jar","example-2-lda-learn.scala");
        pb.directory(new File(new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda"));
        String[] topics=new String[10];

        try {
            Process p = pb.start();
            System.out.println(pb.command());
            
            	BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
                String l = reader.readLine();
                reader.close();

                File old=new File(new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda"+ File.separatorChar+"general_dist");
        		String newname=new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda"+ File.separatorChar+id+"+"+lower+"+"+upper;
        		File newfile=new File(newname);
        		old.renameTo(newfile);
        		topics=processFile();
        		File folder = new File(new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda");
				File fList[] = folder.listFiles();
	
				for (int i = 0; i < fList.length; i++) {
    				String pes = fList[i].toString();
    				if (pes.endsWith(".gz")) {
						boolean success = fList[i].delete();
    }
}
                
             
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return topics;
        
		
	}

	public String[] directly(){
		return processFile();
	}

	public String[] processFile(){
		String[] topics=new String[10];
		try {
        			
        			BufferedReader brName = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(new File(".").getAbsolutePath() + File.separatorChar + "data" + File.separatorChar + "lda"+ File.separatorChar+id+"+"+lower+"+"+upper
        				+File.separatorChar+"01000"+File.separatorChar+"summary.txt"))));
        			String line;
        			int i=0;
        			String text="";
        			try{
        			while ((line = brName.readLine()) != null){
        				line=line.replace("\t"," ");
        				if (line.contains("Topic")){
        					if (i>0){
        						text = text.substring(0, text.length() - 2);
        						topics[i-1]=text;
        						
								text="";
        					}
        					i++;
        					
        				}
        				else {
        					line=line.replaceAll("\\d","");
        					line=line.replace(".",",");
        					text=text+line;
        				}
        				
        				
        			}
        			topics[9]=text.substring(0, text.length() - 2);
        						topics[i-1]=text;;
        			
        			brName.close();
        			} catch (IOException e) {
            		// TODO Auto-generated catch block
            			e.printStackTrace();
        			}
        		} catch (FileNotFoundException e1) {
        			System.out.println("Appname file not found.");
        			e1.printStackTrace();
        		}
        return topics;
	}	

}

