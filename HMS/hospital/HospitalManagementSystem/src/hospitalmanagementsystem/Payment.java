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
public class Payment extends Patient{
    private String paymentID;
    private int registrationFee;
    private int facilitiesFee;
    private int leadingConsultantFee;
    private int examinAnotherDoctorFee;
    private int totalTestFee;
    private int totalTreatmentFee;
    private String fullname;
    private int sum;
    
    
    
    public void setPaymentID(String paymentID){
        this.paymentID = paymentID;
        
    }
    public String getPaymentID(){
        return paymentID;
    }
    
     public void setRegistrationFee(int registrationFee){
        this.registrationFee = registrationFee;
        
    }
    public int getRegistrationFee(){
        return registrationFee;
    }
    
      public void setFacilitiesFee(int facilitiesFee){
        this.facilitiesFee = facilitiesFee;
        
    }
    public int getFacilitiesFee(){
        return facilitiesFee;
    }
    
    public void setLeadingConsultantFee(int leadingConsultantFee){
        this.leadingConsultantFee = leadingConsultantFee;
        
    }
    public int getLeadingConsultantFee(){
        return leadingConsultantFee;
    }
    
    public void setTotalTestFee(int totalTestFee){
        this.totalTestFee = totalTestFee;
        
    }
    public int getTotalTestFee(){
        return totalTestFee;
    }
    
    public void setTotalTreatmentFee(int totalTreatmentFee){
        this.totalTreatmentFee = totalTreatmentFee;
        
    }
    public int getTotalTreatmentFee(){
        return totalTreatmentFee;
    }
    
    public void setExaminAnotherDoctorFee(int examinAnotherDoctorFee){
        this.examinAnotherDoctorFee = examinAnotherDoctorFee;
        
    }
    public int getExaminAnotherDoctorFee(){
        return examinAnotherDoctorFee;
    }
    
    public void setFullName(String fullname){
        this.fullname = fullname;
        
    }
    public String getFullName(){
        return fullname;
    }
    
    public void setSum(int sum){
        this.sum = sum;
        
    }
    public int getSum(){
        return sum;
    }
}
