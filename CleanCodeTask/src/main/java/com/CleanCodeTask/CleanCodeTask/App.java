package com.CleanCodeTask.CleanCodeTask;
import HouseConstruction.*;
import Interest_Calculator.*;

import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class App 
{
	static Scanner scanner = new Scanner(System.in);
	static Map<String,Integer> ConstructionDetails;
	static PrintStream output =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    static Double principal ;
    static Double rateofInterest;
    static Double timeperiod;
	
    public static void main( String[] args )
    {	
    	Character opt;
        try {
        	
    	do {
    		
    		 output.println("	Select Task	\n"
		        		+ "** Interest Calculator **\n"
		        		+ "1. Simple Interest\n"
		        		+ "2. Compound Interest\n\n"
		        		+ "** Estimating House Construction Cost **\n"
		        		+ "3. Select a Construction Plan : \n");
    		 
    		Character option;
    		option = scanner.next().charAt(0);
    		
    		switch(option) {
    		     
    		case '1':  getInterestDetails();
    		      SimpleInterest simpleinterest = new SimpleInterest(principal,rateofInterest,timeperiod);
    		      output.print("Simple Interest is "+ simpleinterest.getSimpleInterest()+"\n");
    		      break;
    		case '2': getInterestDetails();
    		      CompoundInterest compoundinterest = new CompoundInterest(principal,rateofInterest,timeperiod);
    		      output.print("Compound Interest is "+ compoundinterest.getCompoundInterest() +"\n");
    		      break;
    		case '3': getmoreDetails();  
    		        break;
    		default:  output.print("Select correct option\n");;
    		}
    		
    		output.print("Do you want to enter more Y or N\n");
    		opt= scanner.next().charAt(0);
    		
    	}while(opt!='N');
    	
    	output.print("Terminated Successfully\n");
    	
        }catch(Exception e){}
    	
    }
    public static void getInterestDetails() {
    	
    	output.print("Enter values principal,RateOfInterest, Timeperiod\n");
    	
    	principal = scanner.nextDouble();
    	rateofInterest = scanner.nextDouble();
    	timeperiod = scanner.nextDouble();
    	
    	
    }
    public static void getmoreDetails(){
    	
    	Estimation e = new Estimation();
    	
    	ConstructionDetails = e.getConstructionDetails();
    	
    	Integer SerialNumber=1;
    	
    	
    	Set<Map.Entry<String,Integer>> Plans = e.getConstructionDetails().entrySet();
    	
    	ArrayList<String> options = new ArrayList<String>();
    	output.print("List of Plans Available are\n");
    	
    	for(Map.Entry<String,Integer> details: Plans) {
   
    		options.add(details.getKey());
    		output.print(SerialNumber+" "+ details.getKey()+" "+details.getValue()+ "per Square Meter\n");
    	    SerialNumber++;
    		
    	}
    	
    	Integer key = scanner.nextInt();
    	
        e.SelectedPlan(options.get(key-1));
        
        output.print("Enter the Area(LENGTH x BREADTH)");
        
       Integer length = scanner.nextInt();
       Integer breadth = scanner.nextInt();
    	

       e.SetDimensions(length, breadth);
       
      
    	output.print("The Total Cost for the Construction is "+ e.getCost_Estimation()+"\n");
    	
    	
    	
    }
    
    
}
