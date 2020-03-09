/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

/**
 *
 * @author DIVYA SRI
 */
import java.io.*;


abstract class Plan{  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}
class  DomesticPlan extends Plan{   
     public void getRate(){  
         rate=30;              
    }  
}
class  CommercialPlan extends Plan{  
 
	    public void getRate(){   
	        rate=100;  
	   }  
}
class  InstitutionalPlan extends Plan{    
	    public void getRate(){   
	        rate=500;  
	   }   
}
class GetPlanFactory{  
      
	       public Plan getPlan(String planType){  
	            if(planType == null){  
	             return null;  
	            }  
	          if(planType.equalsIgnoreCase("DOMESTIC_PLAN")) {  
	                 return new DomesticPlan();  
	               }   
	           else if(planType.equalsIgnoreCase("COMMERCIAL_PLAN")){  
	                return new CommercialPlan();  
	            }   
	          else if(planType.equalsIgnoreCase("INSTITUTIONAL_PLAN")) {  
	                return new InstitutionalPlan();  
	          }  
	      return null;  
	   }  
	}


public class Factory_Pattern {
	public static void main(String args[])throws IOException
	{  
	      GetPlanFactory planFactory = new GetPlanFactory();  
	        
	      String planName ="Commercial_plan";
	      int units=100;  
	  
	      Plan p = planFactory.getPlan(planName);  
	       
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            }  

}
