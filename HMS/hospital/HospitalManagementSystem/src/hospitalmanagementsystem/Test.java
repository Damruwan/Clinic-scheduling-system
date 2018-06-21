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
public class Test extends Patient {
    private String testID;
    private String testName;
    private int testYear;
    private String testMonth;
    private int testDate;
    private String testInformation;
    private int testAmount;
    
    
    public void setTestID(String testID){
        this.testID= testID;
        
    }
    public String getTestID(){
        return testID;
    }
    
    public void setTestName(String testName){
        this.testName = testName;
        
    }
    public String getTestName(){
        return testName;
    }
    
    public void setTestYear(int testYear){
        this.testYear= testYear;
        
    }
    public int getTestYear(){
        return testYear;
    }
    
    public void setTestMonth(String testMonth){
        this.testMonth= testMonth;
        
    }
    public String getTestMonth(){
        return testMonth;
    }
    public void setTestDate(int testDate){
        this.testDate= testDate;
        
    }
    public int getTestDate(){
        return testDate;
    } 
    
    public void setTestInformation(String testInformation){
        this.testInformation = testInformation;
        
    }
    public String getTestInformation(){
        return testInformation;
    }
    public void setTestAmount(int testAmount){
        this.testAmount= testAmount;
        
    }
    public int getTestAmount(){
        return testAmount;
    } 
    
}
