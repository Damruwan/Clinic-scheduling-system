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
public class Employee extends Ward {
    private String empID;
    private String post;
    private String firstName;
    private String lastName;
    private String address;
    private int contactNumber;
    private String gender;
    private int dobYear;
    private String dobMonth;
    private int dobDate;
    private int age;
       
   
    public void setFirstName(String firstName){
        this.firstName = firstName;
        
    }
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
        
    }
    public String getLastName(){
        return lastName;
    }
    
    
    public void setAddress(String address){
        this.address = address;
        
    }
    public String getAddress(){
        return address;
    }
    
    public void setPost(String post){
        this.post = post;
        
    }
    public String getPost(){
        return post;
    }
    public void setContactNumber(int contactNumber){
        this.contactNumber = contactNumber;
        
    }
    public int getContactNumber(){
        return contactNumber;
    }
    
    public void setGender(String gender){
        this.gender = gender;
        
    }
    public String getGender(){
        return gender;
    }
    
     public void setDOBYear(int dobYear){
        this.dobYear = dobYear;
        
    }
    public int getDOBYear(){
        return dobYear;
    }
    
    
    public void setDOBMonth(String dobMonth){
        this.dobMonth = dobMonth;
        
    }
    public String getDOBMonth(){
        return dobMonth;
    }
    
    public void setDOBDate(int dobDate){
        this.dobDate = dobDate;
        
    }
    public int getDOBDate(){
        return dobDate;
    }
   
    public void setAge(int age){
        this.age = age;
        
    }
    public int getAge(){
        return age;
    }
    
    public void setEmpID(String empID){
        this.empID= empID;
        
    }
    public String getEmpID(){
        return empID;
    }
       
}


