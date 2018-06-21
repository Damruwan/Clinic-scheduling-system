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
public class Salary extends Employee {
    private String salaryID;
    private int year;
    private String month;
    private int  numberOfAttendance;
    private int salaryRatePerDay;
    private int numberOfOTHours;
    private int OTRatePerHour;
    private int total;
    
    public void setSalaryID(String salaryID){
        this.salaryID = salaryID;
        
    }
    public String getSalaryID(){
        return salaryID;
    }   
    public void setYear(int year){
        this.year= year;
        
    }
    public int getYear(){
        return year;
    }
    public void setMonth(String month){
        this.month = month;
        
    }
    public String getMonth(){
        return month;
    } 
    public void setNumberOfAttendance(int numberOfAttendance){
        this.numberOfAttendance= numberOfAttendance;
        
    }
    public int getNumberOfAttendance(){
        return numberOfAttendance;
    }
     public void setSalaryRatePerDay(int salaryRatePerDay){
        this.salaryRatePerDay= salaryRatePerDay;
        
    }
    public int getSalaryRatePerDay(){
        return salaryRatePerDay;
    }
     public void setNumberOfOTHours(int numberOfOTHours){
        this.numberOfOTHours= numberOfOTHours;
        
    }
    public int getNumberOfOTHours(){
        return numberOfOTHours;
    }
     public void setOTRatePerHour(int OTRatePerHour){
        this.OTRatePerHour= OTRatePerHour;
        
    }
    public int getOTRatePerHour(){
        return OTRatePerHour;
    }
    public void setTotal(int total){
        this.total= total;
        
    }
    public int getTotal(){
        return total;
    }

    
}
