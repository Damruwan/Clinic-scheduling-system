/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author AMSA Damruwan
 */
public class Treatment extends Patient {
    private String treatmentID;
    private String treatment;
    private int prescribeYear;
    private String prescribeMonth;
    private int prescribeDate;
    private String Result;
    private int treatmentAmount;
    
    
    public void setTreatmentID(String treatmentID){
        this.treatmentID= treatmentID;
        
    }
    public String getTreatmentID(){
        return treatmentID;
    }
    
    public void setTreatment(String treatment){
        this.treatment = treatment;
        
    }
    public String getTreatment(){
        return treatment;
    }
    
    public void setPrescribeYear(int prescribeYear){
        this.prescribeYear= prescribeYear;
        
    }
    public int getPrescribeYear(){
        return prescribeYear;
    }
    
    public void setPrescribeMonth(String prescribeMonth){
        this.prescribeMonth= prescribeMonth;
        
    }
    public String getPrescribeMonth(){
        return prescribeMonth;
    }
    public void setPrescribeDate(int prescribeDate){
        this.prescribeDate= prescribeDate;
        
    }
    public int getPrescribeDate(){
        return prescribeDate;
    } 
    
    public void setResult(String Result){
        this.Result = Result;
        
    }
    public String getResult(){
        return Result;
    }
    public void setTreatmentAmount(int treatmentAmount){
        this.treatmentAmount= treatmentAmount;
        
    }
    public int getTreatmentAmount(){
        return treatmentAmount;
    } 
    
}

    

