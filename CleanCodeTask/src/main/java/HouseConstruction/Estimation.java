package HouseConstruction;
import HouseConstruction.Dimensions;

import java.util.HashMap;
import java.util.Map;

public class Estimation extends Dimensions {
       
	   Integer Construction_Cost;
	   String selectedplan;
	  public Map<String,Integer> ConstructionDetails;
	   
       public Estimation(){
    	   
       }
       
       public void ShowConstructionDetails() {
    	   
    	   ConstructionDetails = new HashMap<String,Integer>();
    	   
    	   ConstructionDetails.put("Standard Materials",1200);
    	   ConstructionDetails.put("Above Standard Materials",1500);
    	   ConstructionDetails.put("High Standard Materials",1800);
    	   ConstructionDetails.put("High Standard Materials and fully automated home",2500);
    	   
    	   

       }
       
       public void SetDimensions(Integer length,Integer breadth) {
    	

    	   this.length=length;	   
    	   this.breadth=breadth;

       
       }
       
       public Map<String,Integer> getConstructionDetails() {
    	   
    	   
    	   ShowConstructionDetails();
    	   return this.ConstructionDetails;
    	   
       }
       
       public void SelectedPlan(String selectedplan){
    	   
    	   this.selectedplan = selectedplan;
    	   
       }
       
       public Integer getCost_Estimation() {
    	     
    	  
    	   
    	   return (this.length*this.breadth*ConstructionDetails.get(selectedplan));
       
       }
       
       

}
